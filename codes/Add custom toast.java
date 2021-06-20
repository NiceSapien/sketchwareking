LayoutInflater inflater = getLayoutInflater(); View toastLayout = inflater.inflate(R.layout.custom1, null);

TextView textview1 = (TextView) toastLayout.findViewById(R.id.textview1);
textview1.setText(_text);
LinearLayout linear1 = (LinearLayout) toastLayout.findViewById(R.id.linear1);

Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
toast.setView(toastLayout);
toast.show();
/*IF YOU WANT ROUNDED CORNERS*/
LayoutInflater inflater = getLayoutInflater(); View toastLayout = inflater.inflate(R.layout.custom1, null);

TextView textview1 = (TextView) toastLayout.findViewById(R.id.textview1);
textview1.setText(_text);
LinearLayout linear1 = (LinearLayout) toastLayout.findViewById(R.id.linear1);

android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
gd.setColor(Color.parseColor("#00449a"));
gd.setCornerRadius(60);
gd.setStroke(2, Color.parseColor("#ff0000"));
linear1.setBackground(gd);

Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
toast.setView(toastLayout);
toast.show();
/*TUTORIAL: https://sketchwareking.blogspot.com/p/how-to-add-custom-toast-in-sketchware.html?m=1 */
