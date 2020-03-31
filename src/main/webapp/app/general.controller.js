/**
 * 
 */
 angular.module("crudApp").controller("GeneralController",GeneralController);
 GeneralController.inject=['$scope', 'Plan'];
 
 function GeneralController($scope, Plan) {
 $scope.plans = Plan.query();
 //$scope.plan = {};
 
 }