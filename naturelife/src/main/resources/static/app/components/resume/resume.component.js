angular.module('resume')
     .component('resume', {
          templateUrl: "/app/components/resume/resume.template.html",
          controller: function (productsService, $scope, $location) {


               this.$onInit = function () {
                    $scope.showSucessBuy = false;
                    $scope.showResume = false;

                    var cartProducts = productsService.getCart();
                    if (!cartProducts || !cartProducts.length > 0) {
                         $location.url('/')
                         return;
                    }
                    $scope.showResume = true;
                    $scope.products = cartProducts;
                    $scope.totalPrice = cartProducts.reduce(function (accumulator, cartProduct) {
                         return accumulator + (cartProduct.precioUnitario * cartProduct.cantidad);
                    }, 0);


               }

               $scope.buy = function () {
                    var productsToBuy = productsService.getCart();
                    productsService.deleteAllCartProducts();
                    $scope.showSucessBuy = true;
                    $scope.showResume = false;

               }




          }

     });




