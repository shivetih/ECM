define(["dojo/_base/declare",
	"dojo/_base/lang",
	"icm/base/Constants",
	"icm/model/Case",
	"ecm/LoggerMixin"],
	function(declare, lang, Constants, Case, LoggerMixin){
    return declare("cah.custom.pgwidget.krtlWidget.KRTLProductDataWidgetContentPaneEventListener", [LoggerMixin], {

	contentPane: null,
	searchTemplate: null,

	caseEditableArray: [],

    constructor: function(contentPane){
        this.contentPane = contentPane;
    },

	displayPayload: function(payload) {
        
	},

	initContentPane: function()	{
		this.contentPane.showContentNode();
			
		console.log("This in KRTL ProductDataWidget ContentPane EventListener", this);
		
		
	}


});
});
