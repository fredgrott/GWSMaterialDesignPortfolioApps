/*
 * Copyright 2012 Roman Nurik
 * Modifications Copyright(C) 2016 Fred Grott(GrottWorkShop)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.shareme.gwsmaterialdesignportfolioapps.library.pagerwizard.ui;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

import com.github.shareme.gwsmaterialdesignportfolioapps.library.R;
import com.github.shareme.gwsmaterialdesignportfolioapps.library.pagerwizard.model.Page;

/**
 * TextFragment
 * Created by fgrott on 2/16/2016.
 */
@SuppressWarnings("unused")
public class TextFragment extends Fragment {
  protected static final String ARG_KEY = "key";

  private PageFragmentCallbacks mCallbacks;
  private String mKey;
  private Page mPage;

  protected EditText mEditTextInput;

  public static TextFragment create(String key) {
    Bundle args = new Bundle();
    args.putString(ARG_KEY, key);

    TextFragment f = new TextFragment();
    f.setArguments(args);
    return f;
  }

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    Bundle args = getArguments();
    mKey = args.getString(ARG_KEY);
    mPage = mCallbacks.onGetPage(mKey);
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    View rootView = inflater.inflate(R.layout.fragment_page_text,
            container, false);
    ((TextView) rootView.findViewById(android.R.id.title)).setText(mPage
            .getTitle());

    mEditTextInput = (EditText) rootView.findViewById(R.id.editTextInput);
    mEditTextInput.setText(mPage.getData().getString(Page.SIMPLE_DATA_KEY));
    return rootView;
  }

  @Override
  public void onAttach(Activity activity) {
    super.onAttach(activity);

    if (!(activity instanceof PageFragmentCallbacks)) {
      throw new ClassCastException(
              "Activity must implement PageFragmentCallbacks");
    }

    mCallbacks = (PageFragmentCallbacks) activity;
  }

  @Override
  public void onDetach() {
    super.onDetach();
    mCallbacks = null;
  }

  @Override
  public void onViewCreated(View view, Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    setInputType();
    mEditTextInput.addTextChangedListener(new TextWatcher() {

      @Override
      public void beforeTextChanged(CharSequence s, int start, int count,
                                    int after) {
      }

      @Override
      public void onTextChanged(CharSequence s, int start, int before,
                                int count) {
      }

      @Override
      public void afterTextChanged(Editable editable) {
        mPage.getData().putString(Page.SIMPLE_DATA_KEY,
                (editable != null) ? editable.toString() : null);
        mPage.notifyDataChanged();

      }

    });
  }

  protected void setInputType() {
    mEditTextInput.setInputType(InputType.TYPE_CLASS_TEXT);
  }

  @SuppressWarnings("ConstantConditions")
  @Override
  public void setMenuVisibility(boolean menuVisible) {
    super.setMenuVisibility(menuVisible);

    // In a future update to the support library, this should override
    // setUserVisibleHint
    // instead of setMenuVisibility.

    if (mEditTextInput != null) {
      InputMethodManager imm = (InputMethodManager) getActivity()
              .getSystemService(Context.INPUT_METHOD_SERVICE);
      if (!menuVisible) {
        imm.hideSoftInputFromWindow(getView().getWindowToken(), 0);
      }
    }
  }

}