angular.module('productsList')
     .component('productsList', {
          templateUrl: "/app/components/products-list/products-list.template.html",
          controller: function (productsService, $scope) {

               $scope.products;
              
              
               productsService.getProducts().then(
                    function (response) {
                         $scope.products = response.data;
                    }, function (error) {
                         alert('Error :(');
                    });



          }

     });




