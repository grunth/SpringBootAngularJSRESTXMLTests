/**
 * 
 */
 angular.module('crudApp').factory('Plan',Plan);
 Plan.$inject=['$resource'];

function Plan($resource) {
	
	var resourceUrl = 'api/plans';
	return $resource(resourceUrl,{},{
		'update':{
			method:'PUT'
		}
	});

	}
