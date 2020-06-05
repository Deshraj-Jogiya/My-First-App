package com.DJ.emoji.googlecompat;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.emoji.text.EmojiCompat;
import android.text.Spannable;
import com.DJ.emoji.EmojiProvider;
import com.DJ.emoji.EmojiReplacer;
import com.DJ.emoji.emoji.EmojiCategory;
import com.DJ.emoji.googlecompat.category.ActivitiesCategory;
import com.DJ.emoji.googlecompat.category.AnimalsAndNatureCategory;
import com.DJ.emoji.googlecompat.category.FlagsCategory;
import com.DJ.emoji.googlecompat.category.FoodAndDrinkCategory;
import com.DJ.emoji.googlecompat.category.ObjectsCategory;
import com.DJ.emoji.googlecompat.category.SmileysAndPeopleCategory;
import com.DJ.emoji.googlecompat.category.SymbolsCategory;
import com.DJ.emoji.googlecompat.category.TravelAndPlacesCategory;

public final class GoogleCompatEmojiProvider implements EmojiProvider, EmojiReplacer {
  public GoogleCompatEmojiProvider(@NonNull final EmojiCompat emojiCompat) {
    if (emojiCompat == null) {
      throw new NullPointerException();
    }
  }

  @Override @NonNull public EmojiCategory[] getCategories() {
    return new EmojiCategory[] {
      new SmileysAndPeopleCategory(),
      new AnimalsAndNatureCategory(),
      new FoodAndDrinkCategory(),
      new ActivitiesCategory(),
      new TravelAndPlacesCategory(),
      new ObjectsCategory(),
      new SymbolsCategory(),
      new FlagsCategory()
    };
  }

  @Override public void replaceWithImages(final Context context, final Spannable text, final float emojiSize, final float defaultEmojiSize, final EmojiReplacer fallback) {
    if (EmojiCompat.get().getLoadState() != EmojiCompat.LOAD_STATE_SUCCEEDED
            || emojiSize != defaultEmojiSize
            || EmojiCompat.get().process(text, 0, text.length()) != text) {
      fallback.replaceWithImages(context, text, emojiSize, defaultEmojiSize, null);
    }
  }
}
