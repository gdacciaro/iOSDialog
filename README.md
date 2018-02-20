# iOSDialog - iOS UIAlertView on Android

With this library you can use iOS UIAlertView on Android.<br>
<table>
<tr>
<td><img src="http://i.imgur.com/E2BYMfG.jpg" width=250><br>Two Buttons</td>
<td><img src="http://i.imgur.com/L2QNRS4.jpg" width=250><br>One Button</td>
</tr>
</table>
<br>
To install the library just add this line to your gradle:
	
	compile 'com.gdacciaro:iosdialog:1.0.3'
	
And add this where you want:

	  new iOSDialogBuilder(MainActivity.this)
		.setTitle(getString(R.string.example_title))
		.setSubtitle(getString(R.string.example_subtitle))
		.setBoldPositiveLabel(true)
		.setCancelable(false)
		.setPositiveListener(getString(R.string.ok),new iOSDialogClickListener() {
		    @Override
		    public void onClick(iOSDialog dialog) {
			Toast.makeText(MainActivity.this,"Clicked!",Toast.LENGTH_LONG).show();
			dialog.dismiss();

		    }
		})
		.setNegativeListener(getString(R.string.dismiss), new iOSDialogClickListener() {
		    @Override
		    public void onClick(iOSDialog dialog) {
			dialog.dismiss();
		    }
		})
		.build().show();
	
	
If you liked this library, add a star to this project and feel free to make a <b>fork!</b><br>
<br><br>
<hr>
A special thanks to Rofiq Setiawan who made a porting of iOSDialog for Xamarin.
Check it out here: <a href="https://github.com/rofiqsetiawan/iOSDialog">https://github.com/rofiqsetiawan/iOSDialog</a>
<br>
Another special thanks to Francesco Borrelli who helped me with the implementation of the iOSDialogClickListener
Here is his Linkedin profile <a href="https://github.com/rofiqsetiawan/iOSDialog">https://www.linkedin.com/in/francesco-borrelli1/</a>

