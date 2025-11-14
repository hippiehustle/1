package c0;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class w implements TextWatcher, SpanWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final Object f9420d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f9421e = new AtomicInteger(0);

    public w(Object obj) {
        this.f9420d = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f9420d).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i8, int i9) {
        ((TextWatcher) this.f9420d).beforeTextChanged(charSequence, i4, i8, i9);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i4, int i8) {
        if (this.f9421e.get() > 0 && (obj instanceof z)) {
            return;
        }
        ((SpanWatcher) this.f9420d).onSpanAdded(spannable, obj, i4, i8);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i4, int i8, int i9, int i10) {
        int i11;
        int i12;
        if (this.f9421e.get() > 0 && (obj instanceof z)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            if (i4 > i8) {
                i4 = 0;
            }
            if (i9 > i10) {
                i11 = i4;
                i12 = 0;
                ((SpanWatcher) this.f9420d).onSpanChanged(spannable, obj, i11, i8, i12, i10);
            }
        }
        i11 = i4;
        i12 = i9;
        ((SpanWatcher) this.f9420d).onSpanChanged(spannable, obj, i11, i8, i12, i10);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i4, int i8) {
        if (this.f9421e.get() > 0 && (obj instanceof z)) {
            return;
        }
        ((SpanWatcher) this.f9420d).onSpanRemoved(spannable, obj, i4, i8);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i4, int i8, int i9) {
        ((TextWatcher) this.f9420d).onTextChanged(charSequence, i4, i8, i9);
    }
}
