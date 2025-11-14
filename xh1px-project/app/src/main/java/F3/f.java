package F3;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textview.MaterialTextView;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public final class f implements M0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1332d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1333e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1334f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1335g;

    /* renamed from: h, reason: collision with root package name */
    public Object f1336h;

    /* renamed from: i, reason: collision with root package name */
    public Object f1337i;
    public Object j;
    public Object k;

    /* renamed from: l, reason: collision with root package name */
    public Object f1338l;

    /* renamed from: m, reason: collision with root package name */
    public Object f1339m;

    /* renamed from: n, reason: collision with root package name */
    public Object f1340n;

    /* renamed from: o, reason: collision with root package name */
    public Object f1341o;

    /* renamed from: p, reason: collision with root package name */
    public Object f1342p;

    public /* synthetic */ f(boolean z8) {
        this.f1332d = 1;
    }

    public static void b(AbstractC1492c abstractC1492c) {
        if (abstractC1492c instanceof G5.k) {
            ((G5.k) abstractC1492c).getClass();
        } else if (abstractC1492c instanceof G5.d) {
            ((G5.d) abstractC1492c).getClass();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, G5.l] */
    public G5.l a() {
        ?? obj = new Object();
        obj.f1794a = (AbstractC1492c) this.f1333e;
        obj.f1795b = (AbstractC1492c) this.f1334f;
        obj.f1796c = (AbstractC1492c) this.f1335g;
        obj.f1797d = (AbstractC1492c) this.f1336h;
        obj.f1798e = (G5.c) this.f1337i;
        obj.f1799f = (G5.c) this.j;
        obj.f1800g = (G5.c) this.k;
        obj.f1801h = (G5.c) this.f1338l;
        obj.f1802i = (G5.e) this.f1339m;
        obj.j = (G5.e) this.f1340n;
        obj.k = (G5.e) this.f1341o;
        obj.f1803l = (G5.e) this.f1342p;
        return obj;
    }

    public void c(float f8) {
        this.f1337i = new G5.a(f8);
        this.j = new G5.a(f8);
        this.k = new G5.a(f8);
        this.f1338l = new G5.a(f8);
    }

    @Override // M0.a
    public View getRoot() {
        switch (this.f1332d) {
            case 0:
                return (LinearLayout) this.f1333e;
            default:
                return (MaterialCardView) this.f1333e;
        }
    }

    public f(MaterialCardView materialCardView, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialRadioButton materialRadioButton, MaterialTextView materialTextView, RecyclerView recyclerView, MaterialTextView materialTextView2, ConstraintLayout constraintLayout, MaterialTextView materialTextView3, MaterialDivider materialDivider, MaterialTextView materialTextView4) {
        this.f1332d = 2;
        this.f1333e = materialCardView;
        this.f1335g = materialButton;
        this.f1336h = materialButton2;
        this.f1337i = materialButton3;
        this.j = materialRadioButton;
        this.k = materialTextView;
        this.f1338l = recyclerView;
        this.f1339m = materialTextView2;
        this.f1340n = constraintLayout;
        this.f1341o = materialTextView3;
        this.f1334f = materialDivider;
        this.f1342p = materialTextView4;
    }

    public f() {
        this.f1332d = 1;
        this.f1333e = new Object();
        this.f1334f = new Object();
        this.f1335g = new Object();
        this.f1336h = new Object();
        this.f1337i = new G5.a(0.0f);
        this.j = new G5.a(0.0f);
        this.k = new G5.a(0.0f);
        this.f1338l = new G5.a(0.0f);
        int i4 = 0;
        this.f1339m = new G5.e(i4);
        this.f1340n = new G5.e(i4);
        this.f1341o = new G5.e(i4);
        this.f1342p = new G5.e(i4);
    }

    public f(LinearLayout linearLayout, MaterialDivider materialDivider, MaterialDivider materialDivider2, A4.a aVar, A4.c cVar, A.i iVar, A4.a aVar2, A4.c cVar2, A4.c cVar3, A4.c cVar4, A4.a aVar3, A4.d dVar) {
        this.f1332d = 0;
        this.f1333e = linearLayout;
        this.f1334f = materialDivider;
        this.f1335g = materialDivider2;
        this.f1336h = aVar;
        this.k = cVar;
        this.f1338l = iVar;
        this.f1337i = aVar2;
        this.f1339m = cVar2;
        this.f1340n = cVar3;
        this.f1341o = cVar4;
        this.j = aVar3;
        this.f1342p = dVar;
    }
}
