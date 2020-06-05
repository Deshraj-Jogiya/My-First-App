package com.DJ.emoji.facebook.category;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;

import com.DJ.emoji.emoji.EmojiCategory;
import com.DJ.emoji.facebook.FacebookEmoji;
import com.vanniktech.emoji.facebook.R;

@SuppressWarnings("PMD.MethodReturnsInternalArray") public final class TravelAndPlacesCategory implements EmojiCategory {
  private static final FacebookEmoji[] EMOJIS = CategoryUtils.concatAll(TravelAndPlacesCategoryChunk0.get());

  @Override @NonNull public FacebookEmoji[] getEmojis() {
    return EMOJIS;
  }

  @Override @DrawableRes public int getIcon() {
    return R.drawable.emoji_facebook_category_travelandplaces;
  }

  @Override @StringRes public int getCategoryName() {
    return R.string.emoji_facebook_category_travelandplaces;
  }
}
