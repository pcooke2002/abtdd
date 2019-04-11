var myApp = angular.module('myApp', []);

myApp.config(['$httpProvider', function($httpProvider) {
    //initialize get if not there
    if (!$httpProvider.defaults.headers.get) {
        $httpProvider.defaults.headers.get = {};    
    }    

    // Answer edited to include suggestions from comments
    // because previous version of code introduced browser-related errors

    //disable IE ajax request caching
    $httpProvider.defaults.headers.get['If-Modified-Since'] = 'Mon, 26 Jul 1997 05:00:00 GMT';
    // extra
    $httpProvider.defaults.headers.get['Cache-Control'] = 'no-cache';
    $httpProvider.defaults.headers.get['Pragma'] = 'no-cache';
}]);


myApp.controller("calculatorController", function($http, $scope) {
    $scope.divide =  function() {
        $http.get('/divider',{params:{firstNumber: $scope.firstNumber, secondNumber: $scope.secondNumber}}).then(
        function(response){
            $scope.calculatorResult = response.data;
        });
    }
});