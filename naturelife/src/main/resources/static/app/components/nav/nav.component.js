angular.module('navNaturLife')
   .component('navNaturLife', {

      templateUrl: "/app/components/nav/nav.template.html",

      controller: function ($rootScope,$scope) {


         $scope.findProducts = function (name) {
            $rootScope.$emit('findProducts', name);
         }

      }
   });


