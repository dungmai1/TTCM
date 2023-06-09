// Generated by view binder compiler. Do not edit!
package com.maidanhdung.ecommerce.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.maidanhdung.ecommerce.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignInBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnLogin;

  @NonNull
  public final EditText editTextEmailPhone;

  @NonNull
  public final EditText editTextPassword;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView txtSignUp;

  private ActivitySignInBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnLogin,
      @NonNull EditText editTextEmailPhone, @NonNull EditText editTextPassword,
      @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5,
      @NonNull TextView txtSignUp) {
    this.rootView = rootView;
    this.btnLogin = btnLogin;
    this.editTextEmailPhone = editTextEmailPhone;
    this.editTextPassword = editTextPassword;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.textView5 = textView5;
    this.txtSignUp = txtSignUp;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignInBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_in, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignInBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnLogin;
      Button btnLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnLogin == null) {
        break missingId;
      }

      id = R.id.editTextEmailPhone;
      EditText editTextEmailPhone = ViewBindings.findChildViewById(rootView, id);
      if (editTextEmailPhone == null) {
        break missingId;
      }

      id = R.id.editTextPassword;
      EditText editTextPassword = ViewBindings.findChildViewById(rootView, id);
      if (editTextPassword == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.txtSignUp;
      TextView txtSignUp = ViewBindings.findChildViewById(rootView, id);
      if (txtSignUp == null) {
        break missingId;
      }

      return new ActivitySignInBinding((ConstraintLayout) rootView, btnLogin, editTextEmailPhone,
          editTextPassword, textView3, textView4, textView5, txtSignUp);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
