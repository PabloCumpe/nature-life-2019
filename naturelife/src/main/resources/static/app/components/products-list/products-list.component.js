angular.module('productsList')
     .component('productsList', {
          templateUrl: "/app/components/products-list/products-list.template.html",
          controller: function (productsService, $scope, $rootScope, $timeout) {


               this.$onInit = function () {
                    $timeout(function () {
                         $scope.products = $scope.loadProducts();
                    }, 100);

               }

               $scope.loadProducts = function () {
                    $rootScope.$emit('show-loading', 'Emit!');
                    productsService.getApiProducts().then(
                         function (response) {
                              var apiProducts = response.data;
                              var cartProducts = productsService.getCart().map(e => e.id);
                              $scope.products = apiProducts.filter(e => !cartProducts.includes(e.id));
                              $rootScope.$emit('hide-loading', 'Emit!');

                         }, function (error) {
                              alert('Error :(');
                              $rootScope.$emit('hide-loading', 'Emit!');

                         });
               }

               $scope.addProductToCart = function (cantidad, product) {
                    product.cantidad = cantidad;
                    productsService.addProductToCart(product);
                    $scope.products = $scope.loadProducts();

               }

          }

     });




