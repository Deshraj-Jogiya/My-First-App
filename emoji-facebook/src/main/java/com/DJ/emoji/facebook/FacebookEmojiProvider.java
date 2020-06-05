package com.DJ.emoji.facebook;

import androidx.annotation.NonNull;

import com.DJ.emoji.EmojiProvider;
import com.DJ.emoji.emoji.EmojiCategory;
import com.DJ.emoji.facebook.category.ActivitiesCategory;
import com.DJ.emoji.facebook.category.AnimalsAndNatureCategory;
import com.DJ.emoji.facebook.category.FlagsCategory;
import com.DJ.emoji.facebook.category.FoodAndDrinkCategory;
import com.DJ.emoji.facebook.category.ObjectsCategory;
import com.DJ.emoji.facebook.category.SmileysAndPeopleCategory;
import com.DJ.emoji.facebook.category.SymbolsCategory;
import com.DJ.emoji.facebook.category.TravelAndPlacesCategory;

public final class FacebookEmojiProvider implements EmojiProvider {
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
}
