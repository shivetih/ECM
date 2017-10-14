define([ "dojo/_base/declare",
	"dojo/_base/lang",
	"dojo/dom-geometry",
	"dojo/dom-style",
	"icm/base/BasePageWidget",
	"cah/custom/pgwidget/krtlWidget/KRTLProductDataWidgetContentPaneEventListener",
	"cah/custom/pgwidget/krtlWidget/dijit/KRTLProductDataWidgetContentPane",
	"icm/widget/menu/MenuManager",
	"icm/widget/menu/Toolbar",
	"icm/widget/menu/ContextualMenu",
	"icm/base/BaseActionContext"], function(declare, lang, domGeom, domStyle, BasePageWidget,
		eventListener, contentPaneWidget, MenuManager, toolBar, ContextualMenu, BaseActionContext){

    return declare("cah.custom.pgwidget.krtlWidget.KRTLProductDataWidget", [contentPaneWidget, BasePageWidget, BaseActionContext], {

    	contentPaneEventListener: null,
    	topToolbar: null,
    	menu: null,

		/**
		 *
		 */
		postCreate: function(){
			this.inherited(arguments);
			this.contentPaneEventListener = new eventListener(this);
			this.contentPaneEventListener.initContentPane();
			
			console.log("This in Page widget setting krtl product data", this);
			
			console.log("this.productData startup", this.krtlProductData);
			
			this.krtlProductData.startup();
			
		},



		/**
		 * Handler for icm.Custom event.
		 *
		 * @param payload
		 *        	paylod of the event
		 */
		handleICM_CustomEvent: function(payload){
			if(!payload){
				return;
			}
			this.logInfo("handleSearchCasesEvent", payload);
			this.contentPaneEventListener.displayPayload(payload);
		},



	});
});