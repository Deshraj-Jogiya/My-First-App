package com.DJ.emoji.google.category;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;

import com.DJ.emoji.google.GoogleEmoji;
import com.DJ.emoji.emoji.EmojiCategory;
import com.vanniktech.emoji.google.R;

@SuppressWarnings("PMD.MethodReturnsInternalArray") public final class FlagsCategory implements EmojiCategory {
  private static final GoogleEmoji[] EMOJIS = CategoryUtils.concatAll(FlagsCategoryChunk0.get(), FlagsCategoryChunk1.get());

  @Override @NonNull public GoogleEmoji[] getEmojis() {
    return EMOJIS;
  }

  @Override @DrawableRes public int getIcon() {
    return R.drawable.emoji_google_category_flags;
  }

  @Override @StringRes public int getCategoryName() {
    return R.string.emoji_google_category_flags;
  }
}
