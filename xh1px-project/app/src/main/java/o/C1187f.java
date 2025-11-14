package o;

import android.content.Context;
import android.view.View;
import com.buzbuz.smartautoclicker.R;
import n.SubMenuC1103E;

/* renamed from: o.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1187f extends n.w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f13241l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1197k f13242m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1187f(C1197k c1197k, Context context, n.m mVar, View view) {
        super(context, mVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f13242m = c1197k;
        this.f12709f = 8388613;
        W5.a aVar = c1197k.f13269A;
        this.f12711h = aVar;
        n.u uVar = this.f12712i;
        if (uVar != null) {
            uVar.l(aVar);
        }
    }

    @Override // n.w
    public final void c() {
        switch (this.f13241l) {
            case 0:
                C1197k c1197k = this.f13242m;
                c1197k.f13289x = null;
                c1197k.f13270B = 0;
                super.c();
                return;
            default:
                C1197k c1197k2 = this.f13242m;
                n.m mVar = c1197k2.f13273f;
                if (mVar != null) {
                    mVar.c(true);
                }
                c1197k2.f13288w = null;
                super.c();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1187f(C1197k c1197k, Context context, SubMenuC1103E subMenuC1103E, View view) {
        super(context, subMenuC1103E, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f13242m = c1197k;
        if ((subMenuC1103E.f12575A.f12690x & 32) != 32) {
            View view2 = c1197k.f13278m;
            this.f12708e = view2 == null ? (View) c1197k.k : view2;
        }
        W5.a aVar = c1197k.f13269A;
        this.f12711h = aVar;
        n.u uVar = this.f12712i;
        if (uVar != null) {
            uVar.l(aVar);
        }
    }
}
