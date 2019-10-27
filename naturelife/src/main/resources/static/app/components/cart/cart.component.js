angular.module('cart')
   .component('cart', {

      templateUrl: "/app/components/cart/cart.html",

      controller: function (productsService, $scope) {

         $scope.showEmptyCart = false;
         $scope.totalPrice =  0.0;

         this.$onInit = function () {
            $scope.products = productsService.getCart();
            $scope.verifyShowEmptyCart();
            $scope.calculateTotalPrice();

         }

         $scope.calculateTotalPrice = function () {
            $scope.totalPrice = productsService.getCart().reduce(function (accumulator, cartProduct) {
               return accumulator + (cartProduct.precioUnitario*cartProduct.cantidad);
            }, 0);
         }

         $scope.deleteProductFromCart = function (product) {
            productsService.deleteProductFromCart(product);
            $scope.products = productsService.getCart();
            $scope.verifyShowEmptyCart();
            $scope.calculateTotalPrice();

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


