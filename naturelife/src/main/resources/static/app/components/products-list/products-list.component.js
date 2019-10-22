angular.module('productsList')
     .component('productsList', {
          templateUrl: "/app/components/products-list/products-list.template.html",
          controller: function (productsService, $scope, $rootScope) {


               this.$onInit = function () {
                    $scope.products = $scope.loadProducts();
               }

               $scope.loadProducts = function () {
                    $rootScope.$emit('show-loading', 'Emit!');
                     productsService.getApiProducts().then(
                         function (response) {
                              var apiProducts = response.data;
                              var cart = productsService.getCart();
                              $scope.products = apiProducts.filter(e => !cart.includes(e));
                              $rootScope.$emit('hide-loading', 'Emit!');

                         }, function (error) {
                              alert('Error :(');
                              $rootScope.$emit('hide-loading', 'Emit!');

                         }); 
               }

               $scope.addProductToCart = function (product) {
                    productsService.addProductToCart(product);
                    $scope.products = $scope.loadProducts();
               }

          }

     });




