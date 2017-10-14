define(["dojo/_base/declare",
        "dojo/text!./templates/KRTLProductDataWidgetContentPane.html",
    	"icm/base/_BaseWidget",
    	"ecm/widget/listView/ContentList",
    	"ecm/widget/listView/gridModules/RowContextMenu",
    	"ecm/widget/listView/modules/Toolbar2",
    	"ecm/widget/listView/modules/DocInfo",
    	"ecm/widget/listView/gridModules/DndRowMoveCopy",
    	"ecm/widget/listView/gridModules/DndFromDesktopAddDoc",
    	"ecm/widget/listView/modules/Bar",
    	"ecm/widget/listView/modules/ViewDetail","dojo/dom-attr"
   
	],

	function(declare, template, _BaseWidget,
			ContentList,
			RowContextMenu,
			Toolbar2,
			DocInfo,
			DndRowMoveCopy,
			DndFromDesktopAddDoc,
			Bar,
			ViewDetail,domAttr){
	return declare("cah.custom.pgwidget.krtlWidget.dijit.KRTLProductDataWidgetContentPane", [_BaseWidget], {
    templateString: template,
	widgetsInTemplate: true,


	constructor: function(){

    },

	postCreate:	function(){
		this.inherited(arguments);
		this.krtlProductData.setContentListModules(this.getContentListModules());
		console.log("This in dijit widget", this);
		

	},
	
	getContentListModules: function() {
		var viewModules = [];
		viewModules.push(ViewDetail);
		var array = [];
		
		array.push({
			moduleClass: Bar,
			top: [
				[
					[	
					{
						//		moduleClass: Toolbar2
					},
					 
					{
							moduleClasses: viewModules,
							"className": "BarViewModules"
						}
					]
				]
			]
		});
		return array;
	},


	/**
	 * @private destroys this widget
	 */
	destroy: function() {
		//Do any custom clean up here
		this.inherited(arguments);
	}

});
});