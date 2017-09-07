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
	
	compile 'com.gdacciaro:iosdialog:1.0.2'
	
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
And of course, Every donation is well accepted :D
<a href="http://paypal.me/gdacciaro"><img src="https://www.paypalobjects.com/webstatic/paypalme/images/social/pplogo384.png" width=64></a>
