package Q;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final int f4691d;

    /* renamed from: e, reason: collision with root package name */
    public final g f4692e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4693f;

    public a(int i4, g gVar, int i8) {
        this.f4691d = i4;
        this.f4692e = gVar;
        this.f4693f = i8;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f4691d);
        this.f4692e.f4709a.performAction(this.f4693f, bundle);
    }
}
