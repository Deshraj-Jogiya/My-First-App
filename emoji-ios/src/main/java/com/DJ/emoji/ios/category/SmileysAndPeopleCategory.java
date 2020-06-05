package com.DJ.emoji.ios.category;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;

import com.DJ.emoji.emoji.EmojiCategory;
import com.DJ.emoji.ios.IosEmoji;
import com.vanniktech.emoji.ios.R;

@SuppressWarnings("PMD.MethodReturnsInternalArray") public final class SmileysAndPeopleCategory implements EmojiCategory {
  private static final IosEmoji[] EMOJIS = CategoryUtils.concatAll(SmileysAndPeopleCategoryChunk0.get(), SmileysAndPeopleCategoryChunk1.get());

  @Override @NonNull public IosEmoji[] getEmojis() {
    return EMOJIS;
  }

  @Override @DrawableRes public int getIcon() {
    return R.drawable.emoji_ios_category_smileysandpeople;
  }

  @Override @StringRes public int getCategoryName() {
    return R.string.emoji_ios_category_smileysandpeople;
  }
}
