package o5;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import t0.AbstractC1533a0;

/* renamed from: o5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1280b extends AbstractC1533a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f13616a;

    /* renamed from: b, reason: collision with root package name */
    public final List f13617b;

    public C1280b() {
        Paint paint = new Paint();
        this.f13616a = paint;
        this.f13617b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // t0.AbstractC1533a0
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int H2;
        int I8;
        int i4;
        int i8;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f13616a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.f13617b.iterator();
        while (it.hasNext()) {
            ((d) it.next()).getClass();
            paint.setColor(H.b.b(0.0f, -65281, -16776961));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).I0()) {
                C1281c c1281c = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f10019q;
                switch (c1281c.f13619b) {
                    case 0:
                        i4 = 0;
                        break;
                    default:
                        i4 = c1281c.f13620c.J();
                        break;
                }
                float f8 = i4;
                C1281c c1281c2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f10019q;
                switch (c1281c2.f13619b) {
                    case 0:
                        i8 = c1281c2.f13620c.f14822o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = c1281c2.f13620c;
                        i8 = carouselLayoutManager.f14822o - carouselLayoutManager.G();
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f8, 0.0f, i8, paint);
            } else {
                canvas2 = canvas;
                C1281c c1281c3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f10019q;
                switch (c1281c3.f13619b) {
                    case 0:
                        H2 = c1281c3.f13620c.H();
                        break;
                    default:
                        H2 = 0;
                        break;
                }
                float f9 = H2;
                C1281c c1281c4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f10019q;
                switch (c1281c4.f13619b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = c1281c4.f13620c;
                        I8 = carouselLayoutManager2.f14821n - carouselLayoutManager2.I();
                        break;
                    default:
                        I8 = c1281c4.f13620c.f14821n;
                        break;
                }
                canvas2.drawLine(f9, 0.0f, I8, 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
