emailVerified =
fauth.getCurrentUser().isEmailVerified();
/*SEND VERIFICATION EMAIL BUTTON*/
fauth.getCurrentUser().sendEmailVerification() .addOnCompleteListener(new OnCompleteListener<Void>() { @Override public void onComplete(Task<Void> task) { if (task.isSuccessful()) { showMessage("Email sent."); } else { showMessage ("Error sending email");} } });
/*TUTORIAL: https://www.sketchwarehelp.ga/2020/07/emailverificationinsketchware.html */
