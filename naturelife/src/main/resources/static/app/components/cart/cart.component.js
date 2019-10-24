angular.module('cart')
   .component('cart', {

      templateUrl: "/app/components/cart/cart.html",

      controller: function (productsService, $scope) {

         $scope.showEmptyCart = false;

         this.$onInit = function () {
            $scope.products = productsService.getCart();
            $scope.verifyShowEmptyCart();
         }


         $scope.deleteProductFromCart = function (product) {
            productsService.deleteProductFromCart(product);
            $scope.products = productsService.getCart();
            $scope.verifyShowEmptyCart();
         }
         
         $scope.verifyShowEmptyCart = function () {
            if ($scope.products && $scope.products.length) {
               $scope.showEmptyCart = false;
            } else {
               $scope.showEmptyCart = true;

            }

         }

      }
   });


