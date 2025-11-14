package P;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* renamed from: P.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0270s implements InterfaceC0271t {

    /* renamed from: d, reason: collision with root package name */
    public final ScrollFeedbackProvider f4306d;

    public C0270s(NestedScrollView nestedScrollView) {
        this.f4306d = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // P.InterfaceC0271t
    public final void onScrollLimit(int i4, int i8, int i9, boolean z8) {
        this.f4306d.onScrollLimit(i4, i8, i9, z8);
    }

    @Override // P.InterfaceC0271t
    public final void onScrollProgress(int i4, int i8, int i9, int i10) {
        this.f4306d.onScrollProgress(i4, i8, i9, i10);
    }
}
