angular.module('resume')
     .component('resume', {
          templateUrl: "/app/components/resume/resume.template.html",
          controller: function (productsService, $scope, $location, $rootScope, $http, $location) {


               this.$onInit = function () {
                    $scope.showSucessBuy = false;
                    $scope.showResume = false;
                    $scope.enableBuyButton = false;

                    var cartProducts = productsService.getCart();
                    if (!cartProducts || !cartProducts.length > 0) {
                         $location.url('/')
                         return;
                    }
                    $scope.getLoggedCustomerInfo();
                    $scope.products = cartProducts;
                    $scope.totalPrice = cartProducts.reduce(function (accumulator, cartProduct) {
                         return accumulator + (cartProduct.precioUnitario * cartProduct.cantidad);
                    }, 0);


               }

               $scope.enableBuy = function () {
                    if(!$scope.medioPago){
                         return true;
                    }else{
                         return false;
                    }
               }


               $scope.getLoggedCustomerInfo = function () {
                    var urlBase = $location.protocol() + "://" + $location.host() + ":" + $location.port();
                    $rootScope.$emit('show-loading', 'Emit!');

                    $http.get(urlBase + '/customer').then(
                         function (response) {
                              $scope.customerData = response.data;
                              $rootScope.$emit('hide-loading', 'Emit!');
                              $scope.showResume = true;

                         }, function (error) {
                              $rootScope.$emit('hide-loading', 'Emit!');
                              alert('Error :(');
                         });
               }

               $scope.buy = function (medioPago) {
                    $scope.showResume = false;
                    $rootScope.$emit('show-loading', 'Emit!');
                    productsService.purchaseCart(medioPago).then(
                         function (response) {
                              productsService.deleteAllCartProducts();
                              $scope.showSucessBuy = true;
                              $scope.showResume = false;
                              $rootScope.$emit('hide-loading', 'Emit!');


                         }, function (error) {
                              $rootScope.$emit('hide-loading', 'Emit!');
                              $scope.showResume = true;
                              alert('Error :(');


                         });
               }




          }

     });




