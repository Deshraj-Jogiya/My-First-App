package com.DJ.emoji.googlecompat.category;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;

import com.DJ.emoji.googlecompat.GoogleCompatEmoji;
import com.DJ.emoji.emoji.EmojiCategory;
import com.vanniktech.emoji.googlecompat.R;

@SuppressWarnings("PMD.MethodReturnsInternalArray") public final class TravelAndPlacesCategory implements EmojiCategory {
  private static final GoogleCompatEmoji[] EMOJIS = CategoryUtils.concatAll(TravelAndPlacesCategoryChunk0.get());

  @Override @NonNull public GoogleCompatEmoji[] getEmojis() {
    return EMOJIS;
  }

  @Override @DrawableRes public int getIcon() {
    return R.drawable.emoji_googlecompat_category_travelandplaces;
  }

  @Override @StringRes public int getCategoryName() {
    return R.string.emoji_googlecompat_category_travelandplaces;
  }
}
