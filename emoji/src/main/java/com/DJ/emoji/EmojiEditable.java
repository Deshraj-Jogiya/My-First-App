package com.DJ.emoji;

import com.DJ.emoji.emoji.Emoji;

public interface EmojiEditable extends EmojiDisplayable {
  /** Issues a backspace. */
  void backspace();

  /** Adds the emoji. */
  void input(Emoji emoji);
}
