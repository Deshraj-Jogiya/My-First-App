package com.DJ.emoji.google;

import androidx.annotation.NonNull;
import com.DJ.emoji.EmojiProvider;
import com.DJ.emoji.emoji.EmojiCategory;
import com.DJ.emoji.google.category.ActivitiesCategory;
import com.DJ.emoji.google.category.AnimalsAndNatureCategory;
import com.DJ.emoji.google.category.FlagsCategory;
import com.DJ.emoji.google.category.FoodAndDrinkCategory;
import com.DJ.emoji.google.category.ObjectsCategory;
import com.DJ.emoji.google.category.SmileysAndPeopleCategory;
import com.DJ.emoji.google.category.SymbolsCategory;
import com.DJ.emoji.google.category.TravelAndPlacesCategory;

public final class GoogleEmojiProvider implements EmojiProvider {
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
