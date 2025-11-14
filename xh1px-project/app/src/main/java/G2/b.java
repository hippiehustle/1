package G2;

import A4.c;
import P.r;
import android.view.View;
import com.google.android.material.textview.MaterialTextView;
import h6.AbstractC0837b;
import java.util.Iterator;
import java.util.List;
import o6.s;
import q4.X;

/* loaded from: classes.dex */
public final class b implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1737a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1738b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1739c;

    public /* synthetic */ b(Object obj, int i4, Object obj2) {
        this.f1737a = i4;
        this.f1738b = obj;
        this.f1739c = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o6.s] */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i4, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        a aVar;
        int i15;
        a aVar2;
        Integer num;
        switch (this.f1737a) {
            case 0:
                c cVar = (c) this.f1739c;
                MaterialTextView materialTextView = (MaterialTextView) cVar.f292f;
                view.removeOnLayoutChangeListener(this);
                ?? obj = new Object();
                List list = (List) this.f1738b;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    obj.f13640d = Math.max(obj.f13640d, X.d(materialTextView, (String) it.next()));
                }
                r.a(materialTextView, new E.b(materialTextView, cVar, (s) obj));
                Object tag = materialTextView.getTag();
                if (tag instanceof a) {
                    aVar = (a) tag;
                } else {
                    aVar = null;
                }
                if (aVar != null && (num = aVar.f1735b) != null) {
                    i15 = num.intValue();
                } else {
                    i15 = 0;
                }
                if (i15 >= 0 && i15 < list.size()) {
                    materialTextView.setText((CharSequence) list.get(i15));
                }
                if (aVar != null) {
                    aVar2 = a.a(aVar, list, null, Integer.valueOf(obj.f13640d), 2);
                } else {
                    aVar2 = new a(list, null, Integer.valueOf(obj.f13640d));
                }
                materialTextView.setTag(aVar2);
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                AbstractC0837b.h((View) this.f1738b, (E1.a) this.f1739c);
                return;
        }
    }
}
