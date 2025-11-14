package F3;

import C6.InterfaceC0010k;
import F6.B;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import c7.AbstractC0582a;
import c7.C0590i;
import c7.InterfaceC0588g;
import java.util.List;
import o.p1;
import s7.C1518i;
import s7.s;
import u7.InterfaceC1657j;

/* loaded from: classes.dex */
public final class m implements M0.a {

    /* renamed from: d, reason: collision with root package name */
    public final Object f1371d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1372e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1373f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1374g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f1375h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f1376i;
    public final Object j;
    public final Object k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f1377l;

    public m(FrameLayout frameLayout, ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3, TextView textView, TextView textView2, TextView textView3, ImageView imageView, ConstraintLayout constraintLayout) {
        this.f1371d = frameLayout;
        this.f1372e = imageButton;
        this.f1373f = imageButton2;
        this.f1374g = imageButton3;
        this.f1375h = textView;
        this.f1376i = textView2;
        this.j = textView3;
        this.k = imageView;
        this.f1377l = constraintLayout;
    }

    public m a(InterfaceC0010k interfaceC0010k, List list, InterfaceC0588g interfaceC0588g, B b4, C0590i c0590i, AbstractC0582a abstractC0582a) {
        o6.j.e(list, "typeParameterProtos");
        o6.j.e(interfaceC0588g, "nameResolver");
        o6.j.e(c0590i, "versionRequirementTable");
        o6.j.e(abstractC0582a, "metadataVersion");
        C1518i c1518i = (C1518i) this.f1371d;
        int i4 = abstractC0582a.f9675b;
        if ((i4 != 1 || abstractC0582a.f9676c < 4) && i4 <= 1) {
            c0590i = (C0590i) this.f1375h;
        }
        return new m(c1518i, interfaceC0588g, interfaceC0010k, b4, c0590i, abstractC0582a, (InterfaceC1657j) this.j, (p1) this.k, list);
    }

    @Override // M0.a
    public View getRoot() {
        return (FrameLayout) this.f1371d;
    }

    public m(C1518i c1518i, InterfaceC0588g interfaceC0588g, InterfaceC0010k interfaceC0010k, B b4, C0590i c0590i, AbstractC0582a abstractC0582a, InterfaceC1657j interfaceC1657j, p1 p1Var, List list) {
        String a3;
        o6.j.e(c1518i, "components");
        o6.j.e(interfaceC0588g, "nameResolver");
        o6.j.e(interfaceC0010k, "containingDeclaration");
        o6.j.e(c0590i, "versionRequirementTable");
        o6.j.e(abstractC0582a, "metadataVersion");
        o6.j.e(list, "typeParameters");
        this.f1371d = c1518i;
        this.f1372e = interfaceC0588g;
        this.f1373f = interfaceC0010k;
        this.f1374g = b4;
        this.f1375h = c0590i;
        this.f1376i = abstractC0582a;
        this.j = interfaceC1657j;
        this.k = new p1(this, p1Var, list, "Deserializer for \"" + interfaceC0010k.getName() + '\"', (interfaceC1657j == null || (a3 = interfaceC1657j.a()) == null) ? "[container not found]" : a3);
        this.f1377l = new s(this);
    }
}
