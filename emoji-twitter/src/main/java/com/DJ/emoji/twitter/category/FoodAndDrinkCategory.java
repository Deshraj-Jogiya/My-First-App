package com.DJ.emoji.twitter.category;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;

import com.DJ.emoji.twitter.TwitterEmoji;
import com.DJ.emoji.emoji.EmojiCategory;
import com.vanniktech.emoji.twitter.R;

@SuppressWarnings("PMD.MethodReturnsInternalArray") public final class FoodAndDrinkCategory implements EmojiCategory {
  private static final TwitterEmoji[] EMOJIS = CategoryUtils.concatAll(FoodAndDrinkCategoryChunk0.get());

  @Override @NonNull public TwitterEmoji[] getEmojis() {
    return EMOJIS;
  }

  @Override @DrawableRes public int getIcon() {
    return R.drawable.emoji_twitter_category_foodanddrink;
  }

  @Override @StringRes public int getCategoryName() {
    return R.string.emoji_twitter_category_foodanddrink;
  }
}
