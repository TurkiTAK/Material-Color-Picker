<b>A simple material design based color picker library.</b>

<h2>How to use:</h2>
<br>
1-Add gradle dependency to your module's build.gradle file:



        dependencies{
        //other dependencies here
        compile 'com.turki-alkhateeb:materialcolorpicker:1.0.1'
        }


2-Create a ColorChooserDialog object:


        ColorChooserDialog dialog = new ColorChooserDialog(context);
        colorChooserDialog.setColorListener(new ColorListener() {
            @Override
            public void OnColorClick(View v, int color) {
                //do whatever you want to with the values
            }
        });
        //customize the dialog however you want
        colorChooserDialog.show();



And you are ready to go!!

New features will be coming later.
