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

	final iOSDialog iOSDialog = new iOSDialog(MainActivity.this);
	iOSDialog.setTitle( "Allow \"Calendar\" to access your location while you use the app?");
	iOSDialog.setSubtitle(" ");
	iOSDialog.setNegativeLabel("Don't Allow");
	iOSDialog.setPositiveLabel("Allow");
	iOSDialog.setBoldPositiveLabel(true);
	iOSDialog.setNegativeListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				iOSDialog.dismiss();
			}
	});
	iOSDialog.setPositiveListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Toast.makeText(MainActivity.this,"OK clicked",Toast.LENGTH_SHORT).show();
				iOSDialog.dismiss();
			}
	});
	iOSDialog.show();
	
	
If you liked this library, add a star to this project and feel free to make a <b>fork!</b><br>
<br><br>
<hr>
A special thanks to Rofiq Setiawan who made a porting of iOSDialog for Xamarin.
Check it out here: <a href="https://github.com/rofiqsetiawan/iOSDialog">https://github.com/rofiqsetiawan/iOSDialog</a>
Another special thanks to Francesco Borrelli who helped me with the implementation of the iOSDialogClickListener
Here is his Linkedin profile <a href="https://github.com/rofiqsetiawan/iOSDialog">https://www.linkedin.com/in/francesco-borrelli1/</a>

