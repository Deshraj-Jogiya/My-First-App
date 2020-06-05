package com.DJ.emoji.twitter;

import androidx.annotation.NonNull;
import com.DJ.emoji.EmojiProvider;
import com.DJ.emoji.emoji.EmojiCategory;
import com.DJ.emoji.twitter.category.ActivitiesCategory;
import com.DJ.emoji.twitter.category.AnimalsAndNatureCategory;
import com.DJ.emoji.twitter.category.FlagsCategory;
import com.DJ.emoji.twitter.category.FoodAndDrinkCategory;
import com.DJ.emoji.twitter.category.ObjectsCategory;
import com.DJ.emoji.twitter.category.SmileysAndPeopleCategory;
import com.DJ.emoji.twitter.category.SymbolsCategory;
import com.DJ.emoji.twitter.category.TravelAndPlacesCategory;

public final class TwitterEmojiProvider implements EmojiProvider {
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
