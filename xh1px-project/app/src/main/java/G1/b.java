package G1;

import A1.o;
import K3.C0093g;
import K3.C0095i;
import K3.ViewOnClickListenerC0094h;
import android.content.res.ColorStateList;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.textview.MaterialTextView;
import e4.C0643a;
import f4.C0708a;
import java.util.List;
import k3.C0965l;
import l4.C1021a;
import o3.C1251v;
import t0.L;
import t0.s0;

/* loaded from: classes.dex */
public final class b extends L {

    /* renamed from: e, reason: collision with root package name */
    public final Y1.d f1695e;

    /* renamed from: f, reason: collision with root package name */
    public final o f1696f;

    /* renamed from: g, reason: collision with root package name */
    public final o f1697g;

    /* renamed from: h, reason: collision with root package name */
    public final C1.b f1698h;

    /* renamed from: i, reason: collision with root package name */
    public int f1699i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Y1.d dVar, o oVar, o oVar2, C1.b bVar) {
        super(c.f1700d);
        o6.j.e(dVar, "displayConfigManager");
        this.f1695e = dVar;
        this.f1696f = oVar;
        this.f1697g = oVar2;
        this.f1698h = bVar;
        this.f1699i = dVar.f7104e.f7095b;
    }

    @Override // t0.U
    public final int c(int i4) {
        return this.f1699i;
    }

    @Override // t0.U
    public final void d(s0 s0Var, int i4) {
        C0095i c0095i = (C0095i) s0Var;
        Object g8 = g(i4);
        o6.j.d(g8, "getItem(...)");
        a aVar = (a) g8;
        int i8 = c0095i.f2687v;
        C1.b bVar = this.f1698h;
        switch (i8) {
            case 0:
                o6.j.e(bVar, "itemClickedListener");
                C0093g c0093g = (C0093g) c0095i.f2686u;
                c0093g.f2677d.setOnClickListener(new ViewOnClickListenerC0094h(bVar, c0095i, aVar, 0));
                C0643a c0643a = (C0643a) aVar.f1694b;
                MaterialTextView materialTextView = c0093g.f2679f;
                int i9 = 0;
                materialTextView.setVisibility(0);
                c0093g.f2678e.setImageResource(c0643a.f10606a);
                materialTextView.setText(c0643a.f10607b);
                c0093g.f2680g.setText(c0643a.f10608c);
                ImageView imageView = c0093g.f2681h;
                if (!c0643a.f10610e) {
                    i9 = 8;
                }
                imageView.setVisibility(i9);
                break;
            case 1:
                o6.j.e(bVar, "itemClickedListener");
                C1021a c1021a = (C1021a) c0095i.f2686u;
                c1021a.f12250d.setOnClickListener(new ViewOnClickListenerC0094h(bVar, c0095i, aVar, 2));
                C0708a c0708a = (C0708a) aVar.f1694b;
                MaterialTextView materialTextView2 = c1021a.f12252f;
                int i10 = 0;
                materialTextView2.setVisibility(0);
                materialTextView2.setText(c0708a.f10758g);
                MaterialTextView materialTextView3 = c1021a.f12253g;
                materialTextView3.setText(c0708a.j);
                c1021a.f12254h.setImageResource(c0708a.f10760i);
                materialTextView3.setCompoundDrawableTintList(ColorStateList.valueOf(c1021a.f12250d.getContext().getColor(R.color.iconColor)));
                c1021a.f12255i.setText(c0708a.f10761l);
                c1021a.f12251e.setImageResource(c0708a.k);
                ImageView imageView2 = c1021a.j;
                if (!c0708a.f10759h) {
                    i10 = 8;
                }
                imageView2.setVisibility(i10);
                break;
            default:
                o6.j.e(bVar, "itemClickedListener");
                C1251v c1251v = (C1251v) c0095i.f2686u;
                FrameLayout frameLayout = c1251v.f13496d;
                MaterialTextView materialTextView4 = c1251v.f13499g;
                frameLayout.setOnClickListener(new ViewOnClickListenerC0094h(bVar, c0095i, aVar, 3));
                C0965l c0965l = (C0965l) aVar.f1694b;
                MaterialTextView materialTextView5 = c1251v.f13497e;
                materialTextView5.setVisibility(0);
                c1251v.f13500h.setImageResource(c0965l.f11998a);
                materialTextView5.setText(c0965l.f11999b);
                c1251v.f13498f.setText(c0965l.f12000c);
                String str = c0965l.f12001d;
                if (str != null) {
                    materialTextView4.setText(str);
                    materialTextView4.setVisibility(0);
                    break;
                } else {
                    materialTextView4.setVisibility(8);
                    break;
                }
        }
        this.f1697g.l(Integer.valueOf(i4), c0095i.f14950a);
    }

    @Override // t0.U
    public final s0 e(ViewGroup viewGroup, int i4) {
        return (C0095i) this.f1696f.l(viewGroup, Integer.valueOf(i4));
    }

    @Override // t0.U
    public final void f(s0 s0Var) {
        C0095i c0095i = (C0095i) s0Var;
        o6.j.e(c0095i, "holder");
        this.f1697g.l(Integer.valueOf(c0095i.c()), null);
    }

    @Override // t0.L
    public final void h(List list) {
        int i4 = this.f1699i;
        int i8 = this.f1695e.f7104e.f7095b;
        if (i4 != i8) {
            this.f1699i = i8;
            this.f14788a.b();
        } else {
            super.h(list);
        }
    }
}
