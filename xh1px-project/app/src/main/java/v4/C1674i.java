package v4;

import J3.s;
import L7.AbstractC0166y;
import a6.AbstractC0437l;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.U;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.card.MaterialCardView;
import j3.C0933s;
import o6.v;
import q4.X;

/* renamed from: v4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1674i extends B1.h {

    /* renamed from: l, reason: collision with root package name */
    public final A4.d f15532l;

    /* renamed from: m, reason: collision with root package name */
    public A4.a f15533m;

    public C1674i(Context context) {
        super(context);
        this.f15532l = new A4.d(v.f13643a.b(C1676k.class), new C1673h(this, 0), new C1673h(this, 1), new C0933s(22, this));
    }

    @Override // B1.h
    public final ViewGroup n(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(h()).inflate(R.layout.content_more, viewGroup, false);
        int i4 = R.id.debug_card;
        if (((MaterialCardView) E2.b.r(inflate, R.id.debug_card)) != null) {
            i4 = R.id.field_debug_overlay;
            View r8 = E2.b.r(inflate, R.id.field_debug_overlay);
            if (r8 != null) {
                A4.c e9 = A4.c.e(r8);
                A4.c cVar = (A4.c) e9.f292f;
                i4 = R.id.field_debug_report;
                View r9 = E2.b.r(inflate, R.id.field_debug_report);
                if (r9 != null) {
                    A4.c e10 = A4.c.e(r9);
                    A4.c cVar2 = (A4.c) e10.f292f;
                    i4 = R.id.field_show_report;
                    View r10 = E2.b.r(inflate, R.id.field_show_report);
                    if (r10 != null) {
                        A4.c d2 = A4.c.d(r10);
                        i4 = R.id.field_start_tutorial;
                        View r11 = E2.b.r(inflate, R.id.field_start_tutorial);
                        if (r11 != null) {
                            A4.c d3 = A4.c.d(r11);
                            i4 = R.id.tutorial_card;
                            if (((MaterialCardView) E2.b.r(inflate, R.id.tutorial_card)) != null) {
                                NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                                A4.a aVar = new A4.a(nestedScrollView, e9, e10, d2, d3);
                                String string = h().getString(R.string.field_tutorial_title);
                                o6.j.d(string, "getString(...)");
                                E2.c.A0(d3, string);
                                X.X((A4.c) d3.f293g, E2.d.y(h().getString(R.string.field_tutorial_desc)));
                                E2.c.w0(d3, new s(0, this, C1674i.class, "onTutorialClicked", "onTutorialClicked()V", 0, 0, 29));
                                String string2 = h().getString(R.string.field_show_debug_view_title);
                                o6.j.d(string2, "getString(...)");
                                X.W(cVar, string2);
                                a6.s sVar = a6.s.f7766d;
                                X.X(cVar, sVar);
                                int i8 = 0;
                                int i9 = 0;
                                int i10 = 0;
                                E2.b.J(e9, new C1667b(i9, t(), C1676k.class, "toggleIsDebugViewEnabled", "toggleIsDebugViewEnabled()V", i10, i8, 0));
                                String string3 = h().getString(R.string.item_title_debug_generate_report);
                                o6.j.d(string3, "getString(...)");
                                X.W(cVar2, string3);
                                X.X(cVar2, sVar);
                                E2.b.J(e10, new C1667b(i9, t(), C1676k.class, "toggleIsDebugReportEnabled", "toggleIsDebugReportEnabled()V", i10, i8, 1));
                                String string4 = h().getString(R.string.field_show_debug_report_title);
                                o6.j.d(string4, "getString(...)");
                                E2.c.A0(d2, string4);
                                X.X((A4.c) d2.f293g, AbstractC0437l.X(h().getString(R.string.field_show_debug_report_desc_not_available), h().getString(R.string.field_show_debug_report_desc_available)));
                                E2.c.w0(d2, new C1666a(this, 0));
                                this.f15533m = aVar;
                                o6.j.d(nestedScrollView, "getRoot(...)");
                                return nestedScrollView;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // B1.h
    public final void o(C2.a aVar) {
        if (aVar == C2.a.f583f) {
            C1676k t8 = t();
            C4.f fVar = t8.f15538c;
            boolean booleanValue = ((Boolean) t8.f15539d.f()).booleanValue();
            boolean booleanValue2 = ((Boolean) t8.f15541f.f()).booleanValue();
            SharedPreferences.Editor edit = fVar.f632b.edit();
            o6.j.d(edit, "edit(...)");
            SharedPreferences.Editor putBoolean = edit.putBoolean("Debug_View_Enabled", booleanValue);
            o6.j.d(putBoolean, "putBoolean(...)");
            SharedPreferences.Editor putBoolean2 = putBoolean.putBoolean("Debug_Report_Enabled", booleanValue2);
            o6.j.d(putBoolean2, "putBoolean(...)");
            putBoolean2.apply();
        }
    }

    @Override // B1.h
    public final void q() {
        AbstractC0166y.q(U.e(this), null, null, new C1672g(this, null), 3);
    }

    public final C1676k t() {
        return (C1676k) this.f15532l.getValue();
    }
}
