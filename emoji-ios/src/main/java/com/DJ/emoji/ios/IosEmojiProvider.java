package com.DJ.emoji.ios;

import androidx.annotation.NonNull;

import com.DJ.emoji.EmojiProvider;
import com.DJ.emoji.emoji.EmojiCategory;
import com.DJ.emoji.ios.category.ActivitiesCategory;
import com.DJ.emoji.ios.category.FlagsCategory;
import com.DJ.emoji.ios.category.FoodAndDrinkCategory;
import com.DJ.emoji.ios.category.ObjectsCategory;
import com.DJ.emoji.ios.category.SymbolsCategory;
import com.DJ.emoji.ios.category.TravelAndPlacesCategory;
import com.DJ.emoji.ios.category.AnimalsAndNatureCategory;
import com.DJ.emoji.ios.category.SmileysAndPeopleCategory;

public final class IosEmojiProvider implements EmojiProvider {
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
