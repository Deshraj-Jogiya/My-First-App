package com.DJ.emoji.listeners;

import androidx.annotation.NonNull;

import com.DJ.emoji.EmojiImageView;
import com.DJ.emoji.emoji.Emoji;

public interface OnEmojiClickListener {
  void onEmojiClick(@NonNull EmojiImageView emoji, @NonNull Emoji imageView);
}
