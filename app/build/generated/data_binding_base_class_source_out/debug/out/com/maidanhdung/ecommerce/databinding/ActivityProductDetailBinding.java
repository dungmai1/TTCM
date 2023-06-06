// Generated by view binder compiler. Do not edit!
package com.maidanhdung.ecommerce.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
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

public final class ActivityProductDetailBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnAddToCart;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView txtDesciption;

  @NonNull
  public final TextView txtPrice;

  @NonNull
  public final TextView txtProductNameDetail;

  private ActivityProductDetailBinding(@NonNull RelativeLayout rootView,
      @NonNull Button btnAddToCart, @NonNull ConstraintLayout constraintLayout,
      @NonNull ImageView imageView, @NonNull TextView textView10, @NonNull TextView txtDesciption,
      @NonNull TextView txtPrice, @NonNull TextView txtProductNameDetail) {
    this.rootView = rootView;
    this.btnAddToCart = btnAddToCart;
    this.constraintLayout = constraintLayout;
    this.imageView = imageView;
    this.textView10 = textView10;
    this.txtDesciption = txtDesciption;
    this.txtPrice = txtPrice;
    this.txtProductNameDetail = txtProductNameDetail;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityProductDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityProductDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_product_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityProductDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnAddToCart;
      Button btnAddToCart = ViewBindings.findChildViewById(rootView, id);
      if (btnAddToCart == null) {
        break missingId;
      }

      id = R.id.constraintLayout;
      ConstraintLayout constraintLayout = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = ViewBindings.findChildViewById(rootView, id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.txtDesciption;
      TextView txtDesciption = ViewBindings.findChildViewById(rootView, id);
      if (txtDesciption == null) {
        break missingId;
      }

      id = R.id.txtPrice;
      TextView txtPrice = ViewBindings.findChildViewById(rootView, id);
      if (txtPrice == null) {
        break missingId;
      }

      id = R.id.txtProductNameDetail;
      TextView txtProductNameDetail = ViewBindings.findChildViewById(rootView, id);
      if (txtProductNameDetail == null) {
        break missingId;
      }

      return new ActivityProductDetailBinding((RelativeLayout) rootView, btnAddToCart,
          constraintLayout, imageView, textView10, txtDesciption, txtPrice, txtProductNameDetail);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}