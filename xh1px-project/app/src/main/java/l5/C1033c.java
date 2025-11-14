package l5;

import android.view.View;

/* renamed from: l5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1033c extends AbstractC1031a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogC1035e f12299a;

    public C1033c(DialogC1035e dialogC1035e) {
        this.f12299a = dialogC1035e;
    }

    @Override // l5.AbstractC1031a
    public final void c(View view, int i4) {
        if (i4 == 5) {
            this.f12299a.cancel();
        }
    }

    @Override // l5.AbstractC1031a
    public final void b(View view) {
    }
}
