package com.DJ.emoji.listeners;

import androidx.annotation.NonNull;

import com.DJ.emoji.EmojiImageView;
import com.DJ.emoji.emoji.Emoji;

public interface OnEmojiLongClickListener {
  void onEmojiLongClick(@NonNull EmojiImageView view, @NonNull Emoji emoji);
}
