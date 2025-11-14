package m5;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;
import n6.InterfaceC1163b;
import o6.j;
import w7.AbstractC1759v;

/* loaded from: classes.dex */
public final class d implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12544a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12545b;

    public /* synthetic */ d(int i4, Object obj) {
        this.f12544a = i4;
        this.f12545b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f12544a) {
            case 0:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f12545b;
                int compareTo = Boolean.valueOf(materialButton.f10000r).compareTo(Boolean.valueOf(materialButton2.f10000r));
                if (compareTo == 0) {
                    int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                    if (compareTo2 == 0) {
                        return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
                    }
                    return compareTo2;
                }
                return compareTo;
            default:
                AbstractC1759v abstractC1759v = (AbstractC1759v) obj;
                InterfaceC1163b interfaceC1163b = (InterfaceC1163b) this.f12545b;
                j.b(abstractC1759v);
                String obj3 = interfaceC1163b.m(abstractC1759v).toString();
                AbstractC1759v abstractC1759v2 = (AbstractC1759v) obj2;
                j.b(abstractC1759v2);
                return E2.c.N(obj3, interfaceC1163b.m(abstractC1759v2).toString());
        }
    }
}
