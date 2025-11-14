package A4;

import A.i;
import E.v;
import L6.d0;
import L6.f0;
import O7.N;
import O7.i0;
import Y6.l;
import Y6.m;
import Z5.g;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a6.C0433h;
import a6.x;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.e0;
import c0.o;
import c7.C0589h;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import f7.C0722b;
import f7.C0725e;
import g0.F;
import h6.AbstractC0837b;
import i0.C0878a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import k0.AbstractC0948c;
import k7.C0995a;
import k7.f;
import n0.AbstractC1143u;
import n0.C1141s;
import n0.C1144v;
import n0.C1146x;
import n6.InterfaceC1162a;
import o.p1;
import o6.j;
import q0.C1352h;
import u6.InterfaceC1642c;

/* loaded from: classes.dex */
public final class d implements M0.a, l, g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f294d;

    /* renamed from: e, reason: collision with root package name */
    public Object f295e;

    /* renamed from: f, reason: collision with root package name */
    public Object f296f;

    /* renamed from: g, reason: collision with root package name */
    public Object f297g;

    /* renamed from: h, reason: collision with root package name */
    public Object f298h;

    /* renamed from: i, reason: collision with root package name */
    public Object f299i;

    public /* synthetic */ d() {
        this.f294d = 9;
    }

    public static d a(View view) {
        int i4 = R.id.button_delete;
        MaterialButton materialButton = (MaterialButton) E2.b.r(view, R.id.button_delete);
        if (materialButton != null) {
            i4 = R.id.button_dismiss;
            MaterialButton materialButton2 = (MaterialButton) E2.b.r(view, R.id.button_dismiss);
            if (materialButton2 != null) {
                i4 = R.id.button_save;
                MaterialButton materialButton3 = (MaterialButton) E2.b.r(view, R.id.button_save);
                if (materialButton3 != null) {
                    i4 = R.id.dialog_title;
                    MaterialTextView materialTextView = (MaterialTextView) E2.b.r(view, R.id.dialog_title);
                    if (materialTextView != null) {
                        return new d((ConstraintLayout) view, materialButton, materialButton2, materialButton3, materialTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @Override // Y6.l
    public l B(C0722b c0722b, C0725e c0725e) {
        return ((p1) this.f295e).B(c0722b, c0725e);
    }

    public v b() {
        ArrayList arrayList = (ArrayList) this.f299i;
        Intent intent = (Intent) this.f297g;
        C1144v c1144v = (C1144v) this.f298h;
        if (c1144v != null) {
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                Iterator it = arrayList.iterator();
                AbstractC1143u abstractC1143u = null;
                while (true) {
                    int i4 = 0;
                    if (it.hasNext()) {
                        C1141s c1141s = (C1141s) it.next();
                        int i8 = c1141s.f12803a;
                        Bundle bundle = c1141s.f12804b;
                        AbstractC1143u c6 = c(i8);
                        if (c6 != null) {
                            int[] h8 = c6.h(abstractC1143u);
                            int length = h8.length;
                            while (i4 < length) {
                                arrayList2.add(Integer.valueOf(h8[i4]));
                                arrayList3.add(bundle);
                                i4++;
                            }
                            abstractC1143u = c6;
                        } else {
                            int i9 = AbstractC1143u.f12811i;
                            throw new IllegalArgumentException("Navigation destination " + AbstractC0837b.j((o) this.f296f, i8) + " cannot be found in the navigation graph " + c1144v);
                        }
                    } else {
                        intent.putExtra("android-support-nav:controller:deepLinkIds", AbstractC0436k.P0(arrayList2));
                        intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
                        v vVar = new v((Context) this.f295e);
                        Intent intent2 = new Intent(intent);
                        ComponentName component = intent2.getComponent();
                        if (component == null) {
                            component = intent2.resolveActivity(vVar.f1151e.getPackageManager());
                        }
                        if (component != null) {
                            vVar.g(component);
                        }
                        ArrayList arrayList4 = vVar.f1150d;
                        arrayList4.add(intent2);
                        int size = arrayList4.size();
                        while (i4 < size) {
                            Intent intent3 = (Intent) arrayList4.get(i4);
                            if (intent3 != null) {
                                intent3.putExtra("android-support-nav:controller:deepLinkIntent", intent);
                            }
                            i4++;
                        }
                        return vVar;
                    }
                }
            } else {
                throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
            }
        } else {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        }
    }

    public AbstractC1143u c(int i4) {
        C0433h c0433h = new C0433h();
        C1144v c1144v = (C1144v) this.f298h;
        j.b(c1144v);
        c0433h.addLast(c1144v);
        while (!c0433h.isEmpty()) {
            AbstractC1143u abstractC1143u = (AbstractC1143u) c0433h.removeFirst();
            if (abstractC1143u.f12813e.f13342a == i4) {
                return abstractC1143u;
            }
            if (abstractC1143u instanceof C1144v) {
                Iterator it = ((C1144v) abstractC1143u).iterator();
                while (true) {
                    C1352h c1352h = (C1352h) it;
                    if (c1352h.hasNext()) {
                        c0433h.addLast((AbstractC1143u) c1352h.next());
                    }
                }
            }
        }
        return null;
    }

    public void d(Object obj, String str) {
        j.e(str, "key");
        ((LinkedHashMap) this.f295e).put(str, obj);
        N n3 = (N) ((LinkedHashMap) this.f297g).get(str);
        if (n3 != null) {
            ((i0) n3).g(obj);
        }
        N n8 = (N) ((LinkedHashMap) this.f298h).get(str);
        if (n8 != null) {
            ((i0) n8).g(obj);
        }
    }

    public void e() {
        Iterator it = ((ArrayList) this.f299i).iterator();
        while (it.hasNext()) {
            int i4 = ((C1141s) it.next()).f12803a;
            if (c(i4) == null) {
                int i8 = AbstractC1143u.f12811i;
                StringBuilder s8 = A.j.s("Navigation destination ", AbstractC0837b.j((o) this.f296f, i4), " cannot be found in the navigation graph ");
                s8.append((C1144v) this.f298h);
                throw new IllegalArgumentException(s8.toString());
            }
        }
    }

    @Override // M0.a
    public View getRoot() {
        switch (this.f294d) {
            case 0:
                return (MaterialCardView) this.f295e;
            case 1:
                return (LinearLayout) this.f295e;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return (LinearLayout) this.f295e;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return (LinearLayout) this.f295e;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return (ConstraintLayout) this.f295e;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return (ConstraintLayout) this.f295e;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return (ConstraintLayout) this.f295e;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return (ConstraintLayout) this.f295e;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
            default:
                return (FrameLayout) this.f295e;
            case 13:
                return (MaterialCardView) this.f295e;
            case 14:
                return (ConstraintLayout) this.f295e;
            case 19:
                return (NestedScrollView) this.f295e;
        }
    }

    @Override // Z5.g
    public Object getValue() {
        Z z8 = (Z) this.f299i;
        if (z8 == null) {
            e0 e0Var = (e0) ((InterfaceC1162a) this.f296f).a();
            b0 b0Var = (b0) ((InterfaceC1162a) this.f297g).a();
            AbstractC0948c abstractC0948c = (AbstractC0948c) ((InterfaceC1162a) this.f298h).a();
            j.e(e0Var, "store");
            j.e(b0Var, "factory");
            j.e(abstractC0948c, "extras");
            g0.b0 b0Var2 = new g0.b0(e0Var, b0Var, abstractC0948c);
            InterfaceC1642c interfaceC1642c = (InterfaceC1642c) this.f295e;
            j.e(interfaceC1642c, "modelClass");
            String a3 = interfaceC1642c.a();
            if (a3 != null) {
                Z l6 = b0Var2.l("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(a3), interfaceC1642c);
                this.f299i = l6;
                return l6;
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return z8;
    }

    @Override // Y6.l, Y6.m
    public void k() {
        ((p1) this.f296f).k();
        p1 p1Var = (p1) this.f297g;
        ((HashMap) p1Var.f13350f).put((C0725e) this.f298h, new C0995a((D6.c) AbstractC0436k.G0((ArrayList) this.f299i)));
    }

    @Override // Y6.l
    public void l(C0725e c0725e, C0722b c0722b, C0725e c0725e2) {
        ((p1) this.f295e).l(c0725e, c0722b, c0725e2);
    }

    @Override // Y6.l
    public void o(C0725e c0725e, f fVar) {
        ((p1) this.f295e).o(c0725e, fVar);
    }

    @Override // Y6.l
    public void r(C0725e c0725e, Object obj) {
        ((p1) this.f295e).r(c0725e, obj);
    }

    public String toString() {
        String str;
        switch (this.f294d) {
            case 9:
                StringBuilder sb = new StringBuilder("KmVersionRequirement(kind=");
                f0 f0Var = (f0) this.f295e;
                if (f0Var != null) {
                    sb.append(f0Var);
                    sb.append(", level=");
                    L6.e0 e0Var = (L6.e0) this.f296f;
                    if (e0Var != null) {
                        sb.append(e0Var);
                        sb.append(", version=");
                        d0 d0Var = (d0) this.f299i;
                        if (d0Var != null) {
                            sb.append(d0Var);
                            sb.append(", errorCode=");
                            sb.append((Integer) this.f297g);
                            sb.append(", message=");
                            return A.j.q(sb, (String) this.f298h, ')');
                        }
                        j.i("version");
                        throw null;
                    }
                    j.i("level");
                    throw null;
                }
                j.i("kind");
                throw null;
            case 18:
                String str2 = (String) this.f299i;
                StringBuilder sb2 = new StringBuilder("since ");
                sb2.append((C0589h) this.f295e);
                sb2.append(' ');
                sb2.append((Z5.c) this.f297g);
                Integer num = (Integer) this.f298h;
                String str3 = "";
                if (num == null) {
                    str = "";
                } else {
                    str = " error " + num;
                }
                sb2.append(str);
                if (str2 != null) {
                    str3 = ": " + str2;
                }
                sb2.append(str3);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // Y6.l
    public m v(C0725e c0725e) {
        return ((p1) this.f295e).v(c0725e);
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i4) {
        this.f294d = i4;
        this.f295e = obj;
        this.f296f = obj2;
        this.f297g = obj3;
        this.f298h = obj4;
        this.f299i = obj5;
    }

    public d(C0589h c0589h, a7.e0 e0Var, Z5.c cVar, Integer num, String str) {
        this.f294d = 18;
        j.e(e0Var, "kind");
        this.f295e = c0589h;
        this.f296f = e0Var;
        this.f297g = cVar;
        this.f298h = num;
        this.f299i = str;
    }

    public d(Map map) {
        this.f294d = 21;
        j.e(map, "initialState");
        this.f295e = x.T0(map);
        this.f296f = new LinkedHashMap();
        this.f297g = new LinkedHashMap();
        this.f298h = new LinkedHashMap();
        this.f299i = new F(1, this);
    }

    public d(L2.a aVar) {
        this.f294d = 8;
        int i4 = aVar.f2761a;
        long j = aVar.f2762b;
        long j5 = aVar.f2763c;
        long j8 = aVar.f2764d;
        final int i8 = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
        ofInt.setDuration(j8);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: L2.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ A4.d f2766b;

            {
                this.f2766b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i8) {
                    case 0:
                        j.e(valueAnimator, "it");
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        j.c(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                        int intValue = ((Integer) animatedValue).intValue();
                        A4.d dVar = this.f2766b;
                        d dVar2 = (d) dVar.f295e;
                        if (dVar2 != null) {
                            dVar2.m(Integer.valueOf(intValue));
                        }
                        d dVar3 = (d) dVar.f297g;
                        if (dVar3 != null) {
                            dVar3.m(Integer.valueOf(intValue));
                            return;
                        }
                        return;
                    case 1:
                        j.e(valueAnimator, "it");
                        d dVar4 = (d) this.f2766b.f296f;
                        if (dVar4 != null) {
                            Object animatedValue2 = valueAnimator.getAnimatedValue();
                            j.c(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                            dVar4.m((Integer) animatedValue2);
                            return;
                        }
                        return;
                    default:
                        j.e(valueAnimator, "it");
                        d dVar5 = (d) this.f2766b.f297g;
                        if (dVar5 != null) {
                            Object animatedValue3 = valueAnimator.getAnimatedValue();
                            j.c(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
                            dVar5.m((Integer) animatedValue3);
                            return;
                        }
                        return;
                }
            }
        });
        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, i4);
        ofInt2.setDuration(j8);
        ofInt2.setInterpolator(new LinearInterpolator());
        final int i9 = 1;
        ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: L2.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ A4.d f2766b;

            {
                this.f2766b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i9) {
                    case 0:
                        j.e(valueAnimator, "it");
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        j.c(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                        int intValue = ((Integer) animatedValue).intValue();
                        A4.d dVar = this.f2766b;
                        d dVar2 = (d) dVar.f295e;
                        if (dVar2 != null) {
                            dVar2.m(Integer.valueOf(intValue));
                        }
                        d dVar3 = (d) dVar.f297g;
                        if (dVar3 != null) {
                            dVar3.m(Integer.valueOf(intValue));
                            return;
                        }
                        return;
                    case 1:
                        j.e(valueAnimator, "it");
                        d dVar4 = (d) this.f2766b.f296f;
                        if (dVar4 != null) {
                            Object animatedValue2 = valueAnimator.getAnimatedValue();
                            j.c(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                            dVar4.m((Integer) animatedValue2);
                            return;
                        }
                        return;
                    default:
                        j.e(valueAnimator, "it");
                        d dVar5 = (d) this.f2766b.f297g;
                        if (dVar5 != null) {
                            Object animatedValue3 = valueAnimator.getAnimatedValue();
                            j.c(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
                            dVar5.m((Integer) animatedValue3);
                            return;
                        }
                        return;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        final int i10 = 2;
        animatorSet.playTogether(AbstractC0437l.X(ofInt, ofInt2));
        this.f298h = animatorSet;
        ValueAnimator ofInt3 = ValueAnimator.ofInt(255, 0);
        ofInt3.setStartDelay(j5);
        ofInt3.setDuration(j);
        ofInt3.setInterpolator(new C0878a(1));
        ofInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: L2.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ A4.d f2766b;

            {
                this.f2766b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        j.e(valueAnimator, "it");
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        j.c(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                        int intValue = ((Integer) animatedValue).intValue();
                        A4.d dVar = this.f2766b;
                        d dVar2 = (d) dVar.f295e;
                        if (dVar2 != null) {
                            dVar2.m(Integer.valueOf(intValue));
                        }
                        d dVar3 = (d) dVar.f297g;
                        if (dVar3 != null) {
                            dVar3.m(Integer.valueOf(intValue));
                            return;
                        }
                        return;
                    case 1:
                        j.e(valueAnimator, "it");
                        d dVar4 = (d) this.f2766b.f296f;
                        if (dVar4 != null) {
                            Object animatedValue2 = valueAnimator.getAnimatedValue();
                            j.c(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                            dVar4.m((Integer) animatedValue2);
                            return;
                        }
                        return;
                    default:
                        j.e(valueAnimator, "it");
                        d dVar5 = (d) this.f2766b.f297g;
                        if (dVar5 != null) {
                            Object animatedValue3 = valueAnimator.getAnimatedValue();
                            j.c(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
                            dVar5.m((Integer) animatedValue3);
                            return;
                        }
                        return;
                }
            }
        });
        this.f299i = ofInt3;
    }

    public d(Drawable.Callback callback) {
        this.f294d = 11;
        this.f295e = new J7.g();
        this.f296f = new HashMap();
        this.f297g = new HashMap();
        this.f299i = ".ttf";
        if (!(callback instanceof View)) {
            Z0.c.b("LottieDrawable must be inside of a view for images to work.");
            this.f298h = null;
        } else {
            this.f298h = ((View) callback).getContext().getAssets();
        }
    }

    public d(InterfaceC1642c interfaceC1642c, InterfaceC1162a interfaceC1162a, InterfaceC1162a interfaceC1162a2, InterfaceC1162a interfaceC1162a3) {
        this.f294d = 17;
        j.e(interfaceC1642c, "viewModelClass");
        this.f295e = interfaceC1642c;
        this.f296f = interfaceC1162a;
        this.f297g = interfaceC1162a2;
        this.f298h = interfaceC1162a3;
    }

    public d(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialTextView materialTextView) {
        this.f294d = 5;
        this.f295e = constraintLayout;
        this.f296f = materialButton;
        this.f297g = materialButton2;
        this.f299i = materialButton3;
        this.f298h = materialTextView;
    }

    public d(MaterialCardView materialCardView, ImageView imageView, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        this.f294d = 13;
        this.f295e = materialCardView;
        this.f296f = imageView;
        this.f298h = materialTextView;
        this.f297g = materialTextView2;
        this.f299i = materialTextView3;
    }

    public d(LinearLayout linearLayout, i iVar, a aVar, c cVar, d dVar, MaterialCardView materialCardView) {
        this.f294d = 1;
        this.f295e = linearLayout;
        this.f296f = iVar;
        this.f297g = aVar;
        this.f298h = cVar;
        this.f299i = dVar;
    }

    public d(C1146x c1146x) {
        Intent launchIntentForPackage;
        this.f294d = 22;
        j.e(c1146x, "navController");
        Context context = c1146x.f12818a;
        this.f295e = context;
        this.f296f = new o(context, 1);
        Activity activity = (Activity) H7.m.R(H7.m.X(H7.m.T(context, new H7.o(24)), new H7.o(25)));
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.f297g = launchIntentForPackage;
        this.f299i = new ArrayList();
        this.f298h = c1146x.f12819b.g();
    }

    public d(p1 p1Var, p1 p1Var2, C0725e c0725e, ArrayList arrayList) {
        this.f294d = 16;
        this.f296f = p1Var;
        this.f297g = p1Var2;
        this.f298h = c0725e;
        this.f299i = arrayList;
        this.f295e = p1Var;
    }
}
