angular.module('cart')
   .component('cart', {

      templateUrl: "/app/components/cart/cart.html",

      controller: function (productsService,$scope) {

         $scope.products=productsService.getCart();

         $scope.deleteProductFromCart = function (product) {
            productsService.deleteProductFromCart(product);
            $scope.products=productsService.getCart();

       }

      }
   });


