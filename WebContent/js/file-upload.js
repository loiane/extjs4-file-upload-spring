Ext.onReady(function(){

    Ext.create('Ext.form.Panel', {
        title: 'File Uploader',
        width: 400,
        bodyPadding: 10,
        frame: true,
        renderTo: 'fi-form',    
        items: [{
            xtype: 'filefield',
            name: 'file',
            fieldLabel: 'File',
            labelWidth: 50,
            msgTarget: 'side',
            allowBlank: false,
            anchor: '100%',
            buttonText: 'Select a File...'
        }],

        buttons: [{
            text: 'Upload',
            handler: function() {
                var form = this.up('form').getForm();
                if(form.isValid()){
                    form.submit({
                        url: 'upload.action',
                        waitMsg: 'Uploading your file...',
                        success: function(fp, o) {
                            Ext.Msg.alert('Success', 'Your file has been uploaded.');
                        }
                    });
                }
            }
        }]
    });

});