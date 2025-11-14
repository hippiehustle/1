package M3;

import L7.AbstractC0166y;
import O7.i0;
import a.AbstractC0405a;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.buzbuz.smartautoclicker.R;
import com.buzbuz.smartautoclicker.core.ui.views.clickoffset.ClickOffsetView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import l5.DialogC1035e;
import n6.InterfaceC1163b;
import t6.C1586a;

/* renamed from: M3.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0190x extends z1.b {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3473u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final Object f3474v;

    /* renamed from: w, reason: collision with root package name */
    public M0.a f3475w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0190x(E4.c cVar) {
        super(Integer.valueOf(R.style.AppTheme));
        o6.j.e(cVar, "conditionReport");
        this.f3474v = cVar;
    }

    @Override // z1.b
    public final ViewGroup E() {
        switch (this.f3473u) {
            case 0:
                View inflate = LayoutInflater.from(k()).inflate(R.layout.dialog_config_click_on_condition_offset, (ViewGroup) null, false);
                int i4 = R.id.field_x;
                View r8 = E2.b.r(inflate, R.id.field_x);
                if (r8 != null) {
                    A.i a3 = A.i.a(r8);
                    i4 = R.id.field_y;
                    View r9 = E2.b.r(inflate, R.id.field_y);
                    if (r9 != null) {
                        A.i a4 = A.i.a(r9);
                        i4 = R.id.layout_top_bar;
                        View r10 = E2.b.r(inflate, R.id.layout_top_bar);
                        if (r10 != null) {
                            A4.d a9 = A4.d.a(r10);
                            i4 = R.id.view_clickOffset;
                            ClickOffsetView clickOffsetView = (ClickOffsetView) E2.b.r(inflate, R.id.view_clickOffset);
                            if (clickOffsetView != null) {
                                LinearLayout linearLayout = (LinearLayout) inflate;
                                A4.a aVar = new A4.a(linearLayout, a3, a4, a9, clickOffsetView);
                                ((MaterialTextView) a9.f298h).setText(R.string.field_click_offset_title);
                                final int i8 = 0;
                                A((MaterialButton) a9.f297g, new InterfaceC1163b(this) { // from class: M3.q

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ C0190x f3460e;

                                    {
                                        this.f3460e = this;
                                    }

                                    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
                                    @Override // n6.InterfaceC1163b
                                    public final Object m(Object obj) {
                                        Point point;
                                        f2.e eVar;
                                        Integer num;
                                        Integer num2;
                                        switch (i8) {
                                            case 0:
                                                o6.j.e((View) obj, "it");
                                                this.f3460e.a();
                                                return Z5.y.f7506a;
                                            case 1:
                                                o6.j.e((View) obj, "it");
                                                C0190x c0190x = this.f3460e;
                                                H G8 = c0190x.G();
                                                H3.n nVar = G8.f3356c;
                                                C0191y c0191y = (C0191y) G8.f3358e.f();
                                                if (c0191y != null && (point = c0191y.f3476a) != null && (eVar = (f2.e) nVar.f1950e.a()) != null) {
                                                    nVar.j(f2.e.i(eVar, null, null, null, 0, null, null, null, null, point, 255));
                                                }
                                                c0190x.a();
                                                return Z5.y.f7506a;
                                            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                Editable editable = (Editable) obj;
                                                o6.j.e(editable, "it");
                                                try {
                                                    num = Integer.valueOf(Integer.parseInt(editable.toString()));
                                                } catch (NumberFormatException unused) {
                                                    num = null;
                                                }
                                                if (num != null) {
                                                    int intValue = num.intValue();
                                                    H G9 = this.f3460e.G();
                                                    Point e9 = G9.e();
                                                    i0 i0Var = G9.f3358e;
                                                    C0191y c0191y2 = new C0191y(new Point(intValue, e9.y), EnumC0192z.f3479e);
                                                    i0Var.getClass();
                                                    i0Var.h(null, c0191y2);
                                                }
                                                return Z5.y.f7506a;
                                            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                Editable editable2 = (Editable) obj;
                                                o6.j.e(editable2, "it");
                                                try {
                                                    num2 = Integer.valueOf(Integer.parseInt(editable2.toString()));
                                                } catch (NumberFormatException unused2) {
                                                    num2 = null;
                                                }
                                                if (num2 != null) {
                                                    int intValue2 = num2.intValue();
                                                    H G10 = this.f3460e.G();
                                                    Point e10 = G10.e();
                                                    i0 i0Var2 = G10.f3358e;
                                                    C0191y c0191y3 = new C0191y(new Point(e10.x, intValue2), EnumC0192z.f3479e);
                                                    i0Var2.getClass();
                                                    i0Var2.h(null, c0191y3);
                                                }
                                                return Z5.y.f7506a;
                                            default:
                                                PointF pointF = (PointF) obj;
                                                o6.j.e(pointF, "offset");
                                                H G11 = this.f3460e.G();
                                                Point point2 = new Point((int) pointF.x, (int) pointF.y);
                                                i0 i0Var3 = G11.f3358e;
                                                C0191y c0191y4 = new C0191y(point2, EnumC0192z.f3480f);
                                                i0Var3.getClass();
                                                i0Var3.h(null, c0191y4);
                                                return Z5.y.f7506a;
                                        }
                                    }
                                });
                                MaterialButton materialButton = (MaterialButton) a9.f299i;
                                materialButton.setVisibility(0);
                                final int i9 = 1;
                                A(materialButton, new InterfaceC1163b(this) { // from class: M3.q

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ C0190x f3460e;

                                    {
                                        this.f3460e = this;
                                    }

                                    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
                                    @Override // n6.InterfaceC1163b
                                    public final Object m(Object obj) {
                                        Point point;
                                        f2.e eVar;
                                        Integer num;
                                        Integer num2;
                                        switch (i9) {
                                            case 0:
                                                o6.j.e((View) obj, "it");
                                                this.f3460e.a();
                                                return Z5.y.f7506a;
                                            case 1:
                                                o6.j.e((View) obj, "it");
                                                C0190x c0190x = this.f3460e;
                                                H G8 = c0190x.G();
                                                H3.n nVar = G8.f3356c;
                                                C0191y c0191y = (C0191y) G8.f3358e.f();
                                                if (c0191y != null && (point = c0191y.f3476a) != null && (eVar = (f2.e) nVar.f1950e.a()) != null) {
                                                    nVar.j(f2.e.i(eVar, null, null, null, 0, null, null, null, null, point, 255));
                                                }
                                                c0190x.a();
                                                return Z5.y.f7506a;
                                            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                Editable editable = (Editable) obj;
                                                o6.j.e(editable, "it");
                                                try {
                                                    num = Integer.valueOf(Integer.parseInt(editable.toString()));
                                                } catch (NumberFormatException unused) {
                                                    num = null;
                                                }
                                                if (num != null) {
                                                    int intValue = num.intValue();
                                                    H G9 = this.f3460e.G();
                                                    Point e9 = G9.e();
                                                    i0 i0Var = G9.f3358e;
                                                    C0191y c0191y2 = new C0191y(new Point(intValue, e9.y), EnumC0192z.f3479e);
                                                    i0Var.getClass();
                                                    i0Var.h(null, c0191y2);
                                                }
                                                return Z5.y.f7506a;
                                            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                Editable editable2 = (Editable) obj;
                                                o6.j.e(editable2, "it");
                                                try {
                                                    num2 = Integer.valueOf(Integer.parseInt(editable2.toString()));
                                                } catch (NumberFormatException unused2) {
                                                    num2 = null;
                                                }
                                                if (num2 != null) {
                                                    int intValue2 = num2.intValue();
                                                    H G10 = this.f3460e.G();
                                                    Point e10 = G10.e();
                                                    i0 i0Var2 = G10.f3358e;
                                                    C0191y c0191y3 = new C0191y(new Point(e10.x, intValue2), EnumC0192z.f3479e);
                                                    i0Var2.getClass();
                                                    i0Var2.h(null, c0191y3);
                                                }
                                                return Z5.y.f7506a;
                                            default:
                                                PointF pointF = (PointF) obj;
                                                o6.j.e(pointF, "offset");
                                                H G11 = this.f3460e.G();
                                                Point point2 = new Point((int) pointF.x, (int) pointF.y);
                                                i0 i0Var3 = G11.f3358e;
                                                C0191y c0191y4 = new C0191y(point2, EnumC0192z.f3480f);
                                                i0Var3.getClass();
                                                i0Var3.h(null, c0191y4);
                                                return Z5.y.f7506a;
                                        }
                                    }
                                });
                                TextInputEditText textInputEditText = (TextInputEditText) a3.f89f;
                                int i10 = G().f3357d.f7104e.f7094a.x;
                                int i11 = (-i10) / 2;
                                textInputEditText.setFilters(new K2.i[]{new K2.i(Integer.valueOf(i11), Integer.valueOf(new C1586a(i11, i10 / 2, 1).f15124e))});
                                ((TextInputLayout) a3.f88e).setHint(R.string.field_click_offset_x);
                                final int i12 = 2;
                                E2.c.x0(a3, new InterfaceC1163b(this) { // from class: M3.q

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ C0190x f3460e;

                                    {
                                        this.f3460e = this;
                                    }

                                    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
                                    @Override // n6.InterfaceC1163b
                                    public final Object m(Object obj) {
                                        Point point;
                                        f2.e eVar;
                                        Integer num;
                                        Integer num2;
                                        switch (i12) {
                                            case 0:
                                                o6.j.e((View) obj, "it");
                                                this.f3460e.a();
                                                return Z5.y.f7506a;
                                            case 1:
                                                o6.j.e((View) obj, "it");
                                                C0190x c0190x = this.f3460e;
                                                H G8 = c0190x.G();
                                                H3.n nVar = G8.f3356c;
                                                C0191y c0191y = (C0191y) G8.f3358e.f();
                                                if (c0191y != null && (point = c0191y.f3476a) != null && (eVar = (f2.e) nVar.f1950e.a()) != null) {
                                                    nVar.j(f2.e.i(eVar, null, null, null, 0, null, null, null, null, point, 255));
                                                }
                                                c0190x.a();
                                                return Z5.y.f7506a;
                                            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                Editable editable = (Editable) obj;
                                                o6.j.e(editable, "it");
                                                try {
                                                    num = Integer.valueOf(Integer.parseInt(editable.toString()));
                                                } catch (NumberFormatException unused) {
                                                    num = null;
                                                }
                                                if (num != null) {
                                                    int intValue = num.intValue();
                                                    H G9 = this.f3460e.G();
                                                    Point e9 = G9.e();
                                                    i0 i0Var = G9.f3358e;
                                                    C0191y c0191y2 = new C0191y(new Point(intValue, e9.y), EnumC0192z.f3479e);
                                                    i0Var.getClass();
                                                    i0Var.h(null, c0191y2);
                                                }
                                                return Z5.y.f7506a;
                                            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                Editable editable2 = (Editable) obj;
                                                o6.j.e(editable2, "it");
                                                try {
                                                    num2 = Integer.valueOf(Integer.parseInt(editable2.toString()));
                                                } catch (NumberFormatException unused2) {
                                                    num2 = null;
                                                }
                                                if (num2 != null) {
                                                    int intValue2 = num2.intValue();
                                                    H G10 = this.f3460e.G();
                                                    Point e10 = G10.e();
                                                    i0 i0Var2 = G10.f3358e;
                                                    C0191y c0191y3 = new C0191y(new Point(e10.x, intValue2), EnumC0192z.f3479e);
                                                    i0Var2.getClass();
                                                    i0Var2.h(null, c0191y3);
                                                }
                                                return Z5.y.f7506a;
                                            default:
                                                PointF pointF = (PointF) obj;
                                                o6.j.e(pointF, "offset");
                                                H G11 = this.f3460e.G();
                                                Point point2 = new Point((int) pointF.x, (int) pointF.y);
                                                i0 i0Var3 = G11.f3358e;
                                                C0191y c0191y4 = new C0191y(point2, EnumC0192z.f3480f);
                                                i0Var3.getClass();
                                                i0Var3.h(null, c0191y4);
                                                return Z5.y.f7506a;
                                        }
                                    }
                                });
                                TextInputEditText textInputEditText2 = (TextInputEditText) a4.f89f;
                                int i13 = G().f3357d.f7104e.f7094a.y;
                                int i14 = (-i13) / 2;
                                textInputEditText2.setFilters(new K2.i[]{new K2.i(Integer.valueOf(i14), Integer.valueOf(new C1586a(i14, i13 / 2, 1).f15124e))});
                                ((TextInputLayout) a4.f88e).setHint(R.string.field_click_offset_y);
                                final int i15 = 3;
                                E2.c.x0(a4, new InterfaceC1163b(this) { // from class: M3.q

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ C0190x f3460e;

                                    {
                                        this.f3460e = this;
                                    }

                                    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
                                    @Override // n6.InterfaceC1163b
                                    public final Object m(Object obj) {
                                        Point point;
                                        f2.e eVar;
                                        Integer num;
                                        Integer num2;
                                        switch (i15) {
                                            case 0:
                                                o6.j.e((View) obj, "it");
                                                this.f3460e.a();
                                                return Z5.y.f7506a;
                                            case 1:
                                                o6.j.e((View) obj, "it");
                                                C0190x c0190x = this.f3460e;
                                                H G8 = c0190x.G();
                                                H3.n nVar = G8.f3356c;
                                                C0191y c0191y = (C0191y) G8.f3358e.f();
                                                if (c0191y != null && (point = c0191y.f3476a) != null && (eVar = (f2.e) nVar.f1950e.a()) != null) {
                                                    nVar.j(f2.e.i(eVar, null, null, null, 0, null, null, null, null, point, 255));
                                                }
                                                c0190x.a();
                                                return Z5.y.f7506a;
                                            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                Editable editable = (Editable) obj;
                                                o6.j.e(editable, "it");
                                                try {
                                                    num = Integer.valueOf(Integer.parseInt(editable.toString()));
                                                } catch (NumberFormatException unused) {
                                                    num = null;
                                                }
                                                if (num != null) {
                                                    int intValue = num.intValue();
                                                    H G9 = this.f3460e.G();
                                                    Point e9 = G9.e();
                                                    i0 i0Var = G9.f3358e;
                                                    C0191y c0191y2 = new C0191y(new Point(intValue, e9.y), EnumC0192z.f3479e);
                                                    i0Var.getClass();
                                                    i0Var.h(null, c0191y2);
                                                }
                                                return Z5.y.f7506a;
                                            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                Editable editable2 = (Editable) obj;
                                                o6.j.e(editable2, "it");
                                                try {
                                                    num2 = Integer.valueOf(Integer.parseInt(editable2.toString()));
                                                } catch (NumberFormatException unused2) {
                                                    num2 = null;
                                                }
                                                if (num2 != null) {
                                                    int intValue2 = num2.intValue();
                                                    H G10 = this.f3460e.G();
                                                    Point e10 = G10.e();
                                                    i0 i0Var2 = G10.f3358e;
                                                    C0191y c0191y3 = new C0191y(new Point(e10.x, intValue2), EnumC0192z.f3479e);
                                                    i0Var2.getClass();
                                                    i0Var2.h(null, c0191y3);
                                                }
                                                return Z5.y.f7506a;
                                            default:
                                                PointF pointF = (PointF) obj;
                                                o6.j.e(pointF, "offset");
                                                H G11 = this.f3460e.G();
                                                Point point2 = new Point((int) pointF.x, (int) pointF.y);
                                                i0 i0Var3 = G11.f3358e;
                                                C0191y c0191y4 = new C0191y(point2, EnumC0192z.f3480f);
                                                i0Var3.getClass();
                                                i0Var3.h(null, c0191y4);
                                                return Z5.y.f7506a;
                                        }
                                    }
                                });
                                final int i16 = 4;
                                clickOffsetView.setOnOffsetChangedListener(new InterfaceC1163b(this) { // from class: M3.q

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ C0190x f3460e;

                                    {
                                        this.f3460e = this;
                                    }

                                    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
                                    @Override // n6.InterfaceC1163b
                                    public final Object m(Object obj) {
                                        Point point;
                                        f2.e eVar;
                                        Integer num;
                                        Integer num2;
                                        switch (i16) {
                                            case 0:
                                                o6.j.e((View) obj, "it");
                                                this.f3460e.a();
                                                return Z5.y.f7506a;
                                            case 1:
                                                o6.j.e((View) obj, "it");
                                                C0190x c0190x = this.f3460e;
                                                H G8 = c0190x.G();
                                                H3.n nVar = G8.f3356c;
                                                C0191y c0191y = (C0191y) G8.f3358e.f();
                                                if (c0191y != null && (point = c0191y.f3476a) != null && (eVar = (f2.e) nVar.f1950e.a()) != null) {
                                                    nVar.j(f2.e.i(eVar, null, null, null, 0, null, null, null, null, point, 255));
                                                }
                                                c0190x.a();
                                                return Z5.y.f7506a;
                                            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                Editable editable = (Editable) obj;
                                                o6.j.e(editable, "it");
                                                try {
                                                    num = Integer.valueOf(Integer.parseInt(editable.toString()));
                                                } catch (NumberFormatException unused) {
                                                    num = null;
                                                }
                                                if (num != null) {
                                                    int intValue = num.intValue();
                                                    H G9 = this.f3460e.G();
                                                    Point e9 = G9.e();
                                                    i0 i0Var = G9.f3358e;
                                                    C0191y c0191y2 = new C0191y(new Point(intValue, e9.y), EnumC0192z.f3479e);
                                                    i0Var.getClass();
                                                    i0Var.h(null, c0191y2);
                                                }
                                                return Z5.y.f7506a;
                                            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                Editable editable2 = (Editable) obj;
                                                o6.j.e(editable2, "it");
                                                try {
                                                    num2 = Integer.valueOf(Integer.parseInt(editable2.toString()));
                                                } catch (NumberFormatException unused2) {
                                                    num2 = null;
                                                }
                                                if (num2 != null) {
                                                    int intValue2 = num2.intValue();
                                                    H G10 = this.f3460e.G();
                                                    Point e10 = G10.e();
                                                    i0 i0Var2 = G10.f3358e;
                                                    C0191y c0191y3 = new C0191y(new Point(e10.x, intValue2), EnumC0192z.f3479e);
                                                    i0Var2.getClass();
                                                    i0Var2.h(null, c0191y3);
                                                }
                                                return Z5.y.f7506a;
                                            default:
                                                PointF pointF = (PointF) obj;
                                                o6.j.e(pointF, "offset");
                                                H G11 = this.f3460e.G();
                                                Point point2 = new Point((int) pointF.x, (int) pointF.y);
                                                i0 i0Var3 = G11.f3358e;
                                                C0191y c0191y4 = new C0191y(point2, EnumC0192z.f3480f);
                                                i0Var3.getClass();
                                                i0Var3.h(null, c0191y4);
                                                return Z5.y.f7506a;
                                        }
                                    }
                                });
                                this.f3475w = aVar;
                                o6.j.d(linearLayout, "getRoot(...)");
                                return linearLayout;
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
            default:
                View inflate2 = LayoutInflater.from(k()).inflate(R.layout.dialog_debug_report_condition, (ViewGroup) null, false);
                int i17 = R.id.layout_top_bar;
                View r11 = E2.b.r(inflate2, R.id.layout_top_bar);
                if (r11 != null) {
                    A4.d a10 = A4.d.a(r11);
                    i17 = R.id.root_confidence_rate;
                    View r12 = E2.b.r(inflate2, R.id.root_confidence_rate);
                    if (r12 != null) {
                        A4.b a11 = A4.b.a(r12);
                        i17 = R.id.root_processing_timing;
                        View r13 = E2.b.r(inflate2, R.id.root_processing_timing);
                        if (r13 != null) {
                            A4.b a12 = A4.b.a(r13);
                            i17 = R.id.root_trigger_count;
                            View r14 = E2.b.r(inflate2, R.id.root_trigger_count);
                            if (r14 != null) {
                                LinearLayout linearLayout2 = (LinearLayout) inflate2;
                                A4.a aVar2 = new A4.a(linearLayout2, a10, a11, a12, A4.b.b(r14));
                                ((MaterialTextView) a10.f298h).setText(((E4.c) this.f3474v).f1201b.f11791c);
                                ((MaterialButton) a10.f299i).setVisibility(8);
                                ((MaterialButton) a10.f297g).setOnClickListener(new B2.b(5, this));
                                this.f3475w = aVar2;
                                o6.j.d(linearLayout2, "getRoot(...)");
                                return linearLayout2;
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i17)));
        }
    }

    @Override // z1.b
    public final void F(DialogC1035e dialogC1035e) {
        switch (this.f3473u) {
            case 0:
                AbstractC0166y.q(androidx.lifecycle.U.e(this), null, null, new C0188v(this, null), 3);
                return;
            default:
                E4.c cVar = (E4.c) this.f3474v;
                A4.a aVar = (A4.a) this.f3475w;
                if (aVar != null) {
                    AbstractC0405a.x0((A4.b) aVar.f283h, R.string.section_title_report_condition_detected_count, cVar.f1202c, R.string.section_title_report_condition_processing_count, cVar.f1203d);
                    AbstractC0405a.y0((A4.b) aVar.f282g, R.string.section_title_report_timing_title, cVar.f1205f, cVar.f1204e, cVar.f1206g);
                    AbstractC0405a.y0((A4.b) aVar.f281f, R.string.section_title_report_confidence_title, cVar.f1208i, cVar.f1207h, cVar.j);
                    return;
                }
                o6.j.i("viewBinding");
                throw null;
        }
    }

    public H G() {
        return (H) ((A4.d) this.f3474v).getValue();
    }

    public C0190x() {
        super(Integer.valueOf(R.style.ScenarioConfigTheme));
        this.f3474v = new A4.d(o6.v.f13643a.b(H.class), new C0189w(this, 0), new C0189w(this, 1), new D4.z(9, this));
    }
}
