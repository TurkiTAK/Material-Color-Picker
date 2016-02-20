<b>A simple material design based color picker library.</b>

![alt tag](http://im.ezgif.com/tmp/ezgif-1130086348.gif)

<h2>How to use:</h2>
<br>
1-Add gradle dependency to your module's build.gradle file:



        dependencies{
        //other dependencies here
        compile 'com.turki-alkhateeb:materialcolorpicker:1.0.7'
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




<h2>License:</h2>

        Copyright 2016 Turki Alkhateeb
        
        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at
        
            http://www.apache.org/licenses/LICENSE-2.0
        
        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.
