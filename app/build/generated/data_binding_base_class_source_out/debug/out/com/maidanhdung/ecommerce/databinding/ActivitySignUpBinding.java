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

public final class ActivitySignUpBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnCreate;

  @NonNull
  public final EditText editTextEmailPhone;

  @NonNull
  public final EditText editTextFirstName;

  @NonNull
  public final EditText editTextLastName;

  @NonNull
  public final EditText editTextPassword;

  @NonNull
  public final EditText editTextRePassword;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView txtSignIn;

  private ActivitySignUpBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnCreate,
      @NonNull EditText editTextEmailPhone, @NonNull EditText editTextFirstName,
      @NonNull EditText editTextLastName, @NonNull EditText editTextPassword,
      @NonNull EditText editTextRePassword, @NonNull TextView textView3,
      @NonNull TextView textView4, @NonNull TextView txtSignIn) {
    this.rootView = rootView;
    this.btnCreate = btnCreate;
    this.editTextEmailPhone = editTextEmailPhone;
    this.editTextFirstName = editTextFirstName;
    this.editTextLastName = editTextLastName;
    this.editTextPassword = editTextPassword;
    this.editTextRePassword = editTextRePassword;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.txtSignIn = txtSignIn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_up, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignUpBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnCreate;
      Button btnCreate = ViewBindings.findChildViewById(rootView, id);
      if (btnCreate == null) {
        break missingId;
      }

      id = R.id.editTextEmailPhone;
      EditText editTextEmailPhone = ViewBindings.findChildViewById(rootView, id);
      if (editTextEmailPhone == null) {
        break missingId;
      }

      id = R.id.editTextFirstName;
      EditText editTextFirstName = ViewBindings.findChildViewById(rootView, id);
      if (editTextFirstName == null) {
        break missingId;
      }

      id = R.id.editTextLastName;
      EditText editTextLastName = ViewBindings.findChildViewById(rootView, id);
      if (editTextLastName == null) {
        break missingId;
      }

      id = R.id.editTextPassword;
      EditText editTextPassword = ViewBindings.findChildViewById(rootView, id);
      if (editTextPassword == null) {
        break missingId;
      }

      id = R.id.editTextRePassword;
      EditText editTextRePassword = ViewBindings.findChildViewById(rootView, id);
      if (editTextRePassword == null) {
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

      id = R.id.txtSignIn;
      TextView txtSignIn = ViewBindings.findChildViewById(rootView, id);
      if (txtSignIn == null) {
        break missingId;
      }

      return new ActivitySignUpBinding((ConstraintLayout) rootView, btnCreate, editTextEmailPhone,
          editTextFirstName, editTextLastName, editTextPassword, editTextRePassword, textView3,
          textView4, txtSignIn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
