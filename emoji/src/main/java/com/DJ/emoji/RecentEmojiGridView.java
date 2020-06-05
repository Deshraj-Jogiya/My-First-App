package com.DJ.emoji;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.DJ.emoji.emoji.Emoji;
import com.DJ.emoji.listeners.OnEmojiClickListener;
import com.DJ.emoji.listeners.OnEmojiLongClickListener;
import java.util.Collection;

final class RecentEmojiGridView extends EmojiGridView {
  private RecentEmoji recentEmojis;

  RecentEmojiGridView(@NonNull final Context context) {
    super(context);
  }

  public RecentEmojiGridView init(@Nullable final OnEmojiClickListener onEmojiClickListener,
      @Nullable final OnEmojiLongClickListener onEmojiLongClickListener,
      @NonNull final RecentEmoji recentEmoji) {
    recentEmojis = recentEmoji;

    final Collection<Emoji> emojis = recentEmojis.getRecentEmojis();
    emojiArrayAdapter = new EmojiArrayAdapter(getContext(), emojis.toArray(new Emoji[0]), null,
            onEmojiClickListener, onEmojiLongClickListener);

    setAdapter(emojiArrayAdapter);

    return this;
  }

  public void invalidateEmojis() {
    emojiArrayAdapter.updateEmojis(recentEmojis.getRecentEmojis());
  }
}
